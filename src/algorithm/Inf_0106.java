package algorithm;

import java.util.*;

public class Inf_0106 {
    String answer = "";
    public String solution(String str){
        for(int i=0; i<str.length(); i++){
            // System.out.println(str.charAt(i) + "가 가장 먼저 발견한 위치: " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0106 m = new Inf_0106();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
