package algorithm;

import java.util.Scanner;

public class Inf_0109 {
    public int solution(String str){
        // input: g0en2T0s8eSoft
        // output: 208
        // 맨 앞 0을 없애버리는 것이 관건. 아스키로 빼서 0으로 만들어 없애자!
        // char 0 에서 int 48 빼면 int 0 임
        int answer = 0;
        char[] ca = str.toCharArray();
        for(char c : ca){
            if(c>=48 && c<=57){ // 0~9
                answer = answer*10 + (c-48);
                // answer = 0*10 + (48-48) = 0 + 0 = 0 (0 무시)
                // answer = 0*10 + (50-48) = 0 + 2 = 2 (2 1의자리)
                // answer = 2*10 + (48-48) = 20 + 0 = 20 (2 10의자리, 0 1의자리)
                // answer = 20*10 + (56-48) = 200 + 8 = 208 (2 100의자리, 0 10의자리, 8 1의자리)
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0109 m = new Inf_0109();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
