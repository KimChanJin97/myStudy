package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf_0104_직접뒤집기 {
    public ArrayList<String> solution(String[] str){
        ArrayList<String> al = new ArrayList<>();
        for(String s : str){
            char[] ca = s.toCharArray();
            int lt = 0;
            int rt = ca.length-1;
            while(lt < rt){
                char tmp = ca[lt];
                ca[lt] = ca[rt];
                ca[rt] = tmp;
                lt++; rt--;
            }
            String tmp = String.valueOf(ca); // 기본형 -> 문자열
            al.add(tmp);
        }
        return al;
    }

    public static void main(String[] args) {
        Inf_0104_직접뒤집기 m = new Inf_0104_직접뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        for(String s : m.solution(str)){
            System.out.println(s);
        }
    }
}
