package algorithm;

import java.util.Scanner;

public class Inf_0110 {
    public int[] solution(String s, char t){
        // t e ach e rmod e e
        // 0 1 234 5 6789 0
        // 1012
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i] = p;
            } else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0110 m = new Inf_0110();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        for(int x : m.solution(str, ch)){
            System.out.print(x + " ");
        }
    }
}
