package algorithm;

import java.util.Scanner;

public class Inf_0102_ASCII {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(x>=65 && x<=90){ // A ~ Z, 총 26개
                answer += (char)(x+32); // 대문자를 소문자로 변환
            } else if(x>=97 && x<=122){ // a ~ z, 총 26개
                answer += (char)(x-32); // 소문자를 대문자로 변환
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0102_ASCII m = new Inf_0102_ASCII();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(m.solution(str));
    }

}