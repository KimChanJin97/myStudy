package baekjoon;

import java.util.Scanner;

public class B2231 {
    // 생성자 = 198
    // 분해합 = 198 + 1 + 9 + 8 = 216
    // 본래 생성자의 각 자릿수를 알지 못하니깐 각 자릿수를 9로 추정
    // 최소 생성자 = 129 - 9 - 9 - 9 = 102
    // 생성자의 추정범위 = 102 ~ 129
    // 이 추정 범위에서 분해합이 일치하는 것을 찾으면 됨
    public int solution(int decomposedSum) { // 216
        // 자릿수 구하기
        int num = 0;
        int save = decomposedSum;
        while(save > 0) {
            save /= 10;
            num++;
        }

        // 최소 생성자 구하기
        int minConstructor = decomposedSum - (num * 9);

        // 분해합과 일치하는 생성자 구하기
        int answer = 0;
        for(int i=minConstructor; i<=decomposedSum; i++) {
            answer = i;
            int j = i;

            while(j > 0) {
                answer += j % 10;
                j /= 10;
            }

            if(answer == decomposedSum) {
                answer = i;
                return answer;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        B2231 m = new B2231();
        Scanner sc = new Scanner(System.in);

        int decomposedSum = sc.nextInt();
        System.out.println(m.solution(decomposedSum));
    }
}
