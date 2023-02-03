package algorithm;

import java.util.Scanner;

public class Inf_0205 {
    // ASCII codePoint
    // 0 - 9: 48 - 57
    // A - B: 65 - 90
    // A - a 차이: 32
    // a - b: 97 - 122

    //        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  총21개
    // int[] [0 0 0 0 0 0 0 0 0 0  0  0  0  0  0  0  0  0  0  0  0]
    // int[] [1 1 0 0 0 0 0 0 0 0  0  0  0  0  0  0  0  0  0  0  0]

    public int solution(int n){
        int answer = 0;
        int[] ia = new int[n+1];

        for(int i=2; i<=n; i++){ // 애초에 2부터 시작
            if(ia[i] == 0){ // 소수라면
                answer++; // 카운트
                for(int j=i; j<=n; j=j+i){ // 배열 모든 요소들을 검사하는 것이 아니라 자신의 배수만 검사
                    ia[j]=1; // 소수가 아님을 판단
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Inf_0205 m = new Inf_0205();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));
    }
}

