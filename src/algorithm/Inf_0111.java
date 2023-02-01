package algorithm;

import java.util.Scanner;

public class Inf_0111 {
    public String solution(String str){
        StringBuilder sb = new StringBuilder();
        str = str + " "; // 마지막 요소까지 빠짐없이 비교하기 위해 공백문자 붙이기
        int cnt = 1;

        for(int i=0; i<str.length()-1; i++){ // 마지막 요소까지 빠짐없이 비교
            if(str.charAt(i) == str.charAt(i+1)){ // 내 옆이 같은 수라면
                cnt++;
            } else{
                sb.append(str.charAt(i)); // 내 옆이 다른 수라면
                if(cnt>1){ // cnt가 1보다 크다면
                    sb.append(cnt); // sb에 cnt 붙임
                    cnt=1; // cnt=1 재설정
                }
                // cnt가 1이라면 sb에 cnt 안붙임
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Inf_0111 m = new Inf_0111();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
