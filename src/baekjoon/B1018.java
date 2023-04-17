package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class B1018 {
    public static boolean[][] arr; // 2차원 배열
    public static int min = 64; // 최대 색칠 횟수 8 * 8 부터 잡아두고 최소값으로 갱신

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 토큰만 읽음
        int M = Integer.parseInt(st.nextToken()); // 토큰만 읽음

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) { // 행 11개
            String line = br.readLine(); // 개행문자 전까지만 읽음

            for (int j = 0; j < M; j++) { // 열 12개

                if (line.charAt(j) == 'W') {
                    arr[i][j] = true; // White는 true로 가정
                } else {
                    arr[i][j] = false; // Black은 false로 가정
                }
            }
        }

        int checkRow = N - 7;
        int checkCol = M - 7;

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
