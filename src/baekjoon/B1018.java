package baekjoon;

import java.util.Scanner;

// 체스판 다시 칠하기
public class B1018 {
    public static boolean[][] arr; // 2차원 배열
    public static int min = 64; // 최대 색칠 횟수 8 * 8 부터 잡아두고 최소값으로 갱신

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // 11\s
        int N = sc.nextInt(); // 12\n

        arr = new boolean[M][N];

        for (int i = 0; i < M; i++) { // 행 11개
            String chessBoard = sc.next(); // \s 또는 \n 를 기준으로 문자열을 반환

            for (int j = 0; j < N; j++) { // 열 12개

                if (chessBoard.charAt(j) == 'W') {
                    arr[i][j] = true; // White는 true로 가정
                } else {
                    arr[i][j] = false; // Black은 false로 가정
                }
            }
        }

        int checkRow = M - 7;
        int checkCol = N - 7;

        for (int i = 0; i < checkRow; i++) {
            for (int j = 0; j < checkCol; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int endOfX = x + 8;
        int endOfY = y + 8;
        int count = 0;

        boolean TF = arr[x][y]; // 처음 위치 (x,y)의 색깔을 기준으로 정하기

        for (int i = x; i < endOfX; i++) {
            for (int j = y; j < endOfY; j++) {
                if (arr[i][j] != TF) {
                    count++;
                }
                TF = !TF; // 다음 확인 과정 때 다음칸 색깔과 반대 색깔과 일치하지 않는지 확인해야 하니깐 색깔을 반대로 바꾸기
            }
            TF = !TF; // 행이 바뀌니깐 색깔 반대로 바꾸기
        }

        // TF(첫 색깔)가 만약 반대 색깔이었을 경우도 고려
        count = Math.min(count, 64 - count);

        // 기존의 min과 비교하여 만약 더 작다면 min 갱신
        min = Math.min(min, count);
    }
}
