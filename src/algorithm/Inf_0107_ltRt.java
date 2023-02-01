package algorithm;

import java.util.Scanner;

public class Inf_0107_ltRt {
    public String solution(String str){
        char[] ca = str.toLowerCase().toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt < rt){
            if(ca[lt] == ca[rt]){
                lt++;
                rt--;
            }
            else{
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Inf_0107_ltRt m = new Inf_0107_ltRt();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }

}