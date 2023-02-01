package algorithm;

import java.util.Scanner;

public class Inf_0109_isDigit2 {
    public int solution(String str){
        char[] ca = str.toCharArray();
        String answer = "";
        for(char c : ca){
            if(Character.isDigit(c)){
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Inf_0109_isDigit2 m = new Inf_0109_isDigit2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
