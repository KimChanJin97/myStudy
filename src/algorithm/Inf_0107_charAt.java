package algorithm;

import java.util.Scanner;

public class Inf_0107_charAt {
    public String solution(String str){
        str = str.toUpperCase();
        int len = str.length(); // len은 실제 길이를 의미해야 함
        // aab bbaa, 7/2 = 3
        // aab baa, 6/2 = 3
        for(int i=0; i<len/2; i++){ // 절반만 봐도 됨
            if(str.charAt(i) != str.charAt(len-1-i)) return "NO"; // 회문 아니면 종료
        }
        return "YES"; // 회문이면 종료
    }

    public static void main(String[] args) {
        Inf_0107_charAt m = new Inf_0107_charAt();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }

}
