package algorithm;

import java.util.Scanner;

public class Inf_0103 {
    public static String solution(String str){
        String answer = "";
        int min = Integer.MIN_VALUE; // 최소값 만들기
        String[] answers = str.split(" ");

        for(String x : answers){
            int len = x.length();
            if(len > min){
                min = len;
                answer = x;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0103 m = new Inf_0103();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));

    }
}
