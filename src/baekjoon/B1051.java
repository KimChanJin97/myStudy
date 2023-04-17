package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자 정사각형
public class B1051 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 구분자 제외하고 토큰만 인식
        int M = Integer.parseInt(st.nextToken()); // 구분자 제외하고 토큰만 인식

        // 2차원 배열 만들기
        int[][] intArr = new int[N][M];

        for(int i=0; i<N; i++) { // 행
            String str = br.readLine();

            for (int j = 0; j < M; j++) { // 열
                intArr[i][j] = str.charAt(j) - 48;
                // 문자 타입 숫자('0'~'9')를 정수 타입 숫자(0~9)로 변환하고 intArr에 대입
                // 문자 - 정수하면 정수로 캐스팅되기 때문에 가능
            }
        }

        // 정사각형 최대 변 길이 구하기
        int len = Math.min(N, M);

        // 가장 큰 정사각형 구하기
        while(len > 1) {
            for(int i=0; i<=N-len; i++) {
                for(int j=0; j<=M-len; j++) {
                    int num = intArr[i][j];
                    // 정사각형을 찾는다면
                    if(num==intArr[i][j+len-1]
                            && num==intArr[i+len-1][j]
                            && num==intArr[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                    // 정사각형을 찾지 못한다면 다음 열로 이동
                }
            }
            len--;
        }
        // 모든 행과 열을 뒤져봐도 정사각형을 찾기 못한다면 1 출력
        System.out.println(len*len);
    }
}
