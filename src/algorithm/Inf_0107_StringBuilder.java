package algorithm;

import java.util.Scanner;

public class Inf_0107_StringBuilder {
    public String solution(String str){
        String sb = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(sb)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Inf_0107_StringBuilder m = new Inf_0107_StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
