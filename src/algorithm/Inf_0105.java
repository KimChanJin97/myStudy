package algorithm;

import java.util.Scanner;

public class Inf_0105 {
    public String solution(String str){
        String answer = "";
        char[] ca = str.toCharArray();
        // A~Z(65~90), a~z(97~122), A~a거리 36
        int lt = 0;
        int rt = str.length()-1;
        // int rt = ca.length-1;
        while(lt < rt){
            if(!Character.isAlphabetic(ca[lt])) lt++;
            else if(!Character.isAlphabetic(ca[rt])) rt--;
            else{
                char tmp = ca[lt];
                ca[lt] = ca[rt];
                ca[rt] = tmp;
                lt++; rt--;
            }
        }
        answer = String.valueOf(ca);
        return answer;
    }

    public static void main(String[] args) {
        Inf_0105 m = new Inf_0105();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
