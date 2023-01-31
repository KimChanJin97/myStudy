package algorithm;

import java.util.Scanner;

public class Inf_0108_replaceAll {
    // replaceAll로 특수문자 제거
    public String solution(String str){
        str = str.replaceAll("[^a-zA-Z]", "").toUpperCase();
        // [] 요소 맨 앞에 ^ 넣어서 반대로 만들기, not영어소대문자는 특수문자를 의미
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Inf_0108_replaceAll m = new Inf_0108_replaceAll();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
