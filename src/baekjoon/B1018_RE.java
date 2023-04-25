package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018_RE {
    static boolean[][] answer;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // boolean형 2차원 배열 만들기
        answer = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                if(str.charAt(j) == 'W') {
                    answer[i][j] = true;
                } else {
                    answer[i][j] = false;
                }
            }
        }

        int rowCheckingNum = N - 7;
        int colCheckingNum = M - 7;

        for(int i=0; i<rowCheckingNum; i++) {
            for(int j=0; j<colCheckingNum; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    static void find(int x, int y) {
        int endOfX = x + 8;
        int endOfY = y + 8;
        int trueOrFalseCount = 0;

        boolean standardColor = answer[x][y];

        for(int i=x; i<endOfX; i++) {
            for(int j=y; j<endOfY; j++) {
                if(answer[i][j] != standardColor) { // 기준 색깔과 다르다면
                    trueOrFalseCount++; // 색칠 횟수 +1
                }
                standardColor = !standardColor; // 다음 열의 색깔을 판단하기 위해 색깔 반대로 바꾸기
            }
            standardColor = !standardColor; // 다음 행의 색깔을 판단하기 위해 색깔 반대로 바꾸기
        }

        // 현재 8*8 보드판에서 색깔이 반대였을 경우의 색칠 횟수과 비교하여 작은 것으로 갱신
        trueOrFalseCount = Math.min(trueOrFalseCount, 64 - trueOrFalseCount);

        // 모든 8*8 보드판에서 색칠 횟수를 작은 것으로 갱신
        min = Math.min(trueOrFalseCount, min);
    }
}
