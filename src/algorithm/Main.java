package algorithm;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String s = str.toUpperCase();
        // aabb baa, 7/2 = 3, 어짜피 for문에서 [3] 미포함
        // aabb aa, 6/2 = 3, 어짜피 for문에서 [3] 미포함
        int len = s.length();
        char[] ca = s.toCharArray();
        for(int i=0; i<len/2; i++){ // 012
            if(ca[0] != ca[len-1-i]) return "NO"; // len은 실제 길이이므로 -1
            // [0,]
        }
        return "YES";
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }

}