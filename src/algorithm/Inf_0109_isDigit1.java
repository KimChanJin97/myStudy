package algorithm;

import java.util.Scanner;

public class Inf_0109_isDigit1 {
    public String solution(String str){
        char[] ca = str.toCharArray();
        String answer = "";
        for(char c : ca){
            if(Character.isDigit(c)){
                answer += c;
            }
        }
        if(answer.charAt(0) == '0'){
            answer = answer.substring(1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0109_isDigit1 m = new Inf_0109_isDigit1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
