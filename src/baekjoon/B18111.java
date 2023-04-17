package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18111 {
    static int time = Integer.MAX_VALUE; // 블럭 추가하거나 제거하는 데 걸린 시간
    static int blocks = 0; // 추가되거나 제거되는 인벤토리 내 블럭 개수
    static int[] timeAndBlocks = new int[2]; // idx0은 시간, idx1은 인벤토리 내 블럭 개수
    static int[][] intArr;

    static int I;
    static int J;
    static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        I = Integer.parseInt(st.nextToken()); // 행
        J = Integer.parseInt(st.nextToken()); // 렬
        B = Integer.parseInt(st.nextToken()); // 인벤토리 내 블럭 개수

        // 정수형 2차원 배열 만들 준비
        intArr = new int[I][J];

        // 정수형 2차원 배열 채우면서 블럭 최대 높이 구하기
        int max = 0;
        for(int i=0; i<I; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<J; j++) {
                intArr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, intArr[i][j]);
            }
        }
        brutalForce(max);
        System.out.println(time + " " + blocks);

    }
    // 0 ~ 블럭최대높이 반복문 돌면서 시간과 블럭 계산
    static void brutalForce(int max) {
        for(int i=0; i<=max; i++) {
            // 2차원 배열 돌면서 해당 블럭의 높이를 기준으로 시간과 추가 또는 제거되는 블럭 계산
            timeAndBlocks = setTimeAndBlocks(i);

            // 더 짧은 시간이 걸렸다면
            if(time > timeAndBlocks[0]) {
                time = timeAndBlocks[0]; // idx0은 시간
                blocks = timeAndBlocks[1]; // idx1은 인벤토리 내 블럭 개수
            }
            // 동일한 시간이 걸리고 땅이 높이가 높다면
            else if (time == timeAndBlocks[0] && blocks < timeAndBlocks[1]) {
                time = timeAndBlocks[0]; // idx0은 시간
                blocks = timeAndBlocks[1]; // idx1은 인벤토리 내 블럭 개수
            }
        }
    }

    // 2차원 배열 돌면서
    // 블럭추가와 블럭제거하는 데 걸린 시간 계산
    // 인벤토리 내 추가되거나 제거되는 블럭 개수 계산
    static int[] setTimeAndBlocks(int height) {
        int time = 0;
        int blocks = B;

        for(int i=0; i<I; i++) {
            for(int j=0; j<J; j++) {
                int presentHeight = intArr[i][j];
                // presentHeight는 현재 기준으로 삼는 블럭 높이
                // height는 땅 중 최대 블럭 높이

                if(presentHeight == height) { // 땅고르기를 할 필요 없다면
                    continue;
                }

                if (presentHeight > height) { // 블럭을 제거해야 한다면
                    time += (presentHeight - height)*2; // idx0은 시간
                    blocks += presentHeight - height; // idx1은 인벤토리 내 블럭 개수
                } else { // presentHeight < height 블럭을 추가해야 한다면
                    time += height - presentHeight; // idx0은 시간
                    blocks -= height - presentHeight; // idx1은 인벤토리 내 블럭 개수
                }
            }
        }
        // 인벤토리 내 블럭이 다 떨어진다면 땅 고르기 그만두기
        if(blocks < 0) {
            timeAndBlocks[0] = Integer.MAX_VALUE; // 갱신에서 탈락하도록 시간 최대로 설정
            return timeAndBlocks;
        }

        // 인벤토리 내 블럭이 초과 또는 부족하지 않고 블럭을 제거하거나 쌓은 경우
        timeAndBlocks[0] = time;
        timeAndBlocks[1] = height;

        return timeAndBlocks;
    }

}
