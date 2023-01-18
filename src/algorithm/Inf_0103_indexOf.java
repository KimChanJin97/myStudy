package algorithm;

import java.util.Scanner;

public class Inf_0103_indexOf {
    public static String solution(String str){
        // input = i am very happy
        String answer = "";
        int min = Integer.MIN_VALUE;
        int pos;

        while((pos=str.indexOf(" ")) != -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len > min){
                min = len;
                answer = temp;
            }
            str = str.substring(pos+1);
        }
        // 마지막 단어는 뒤에 공백문자가 없으므로 따로 처리해야 함
        if(str.length() > min){
            return str;
        }
        return answer;
    }


    public static void main(String[] args) {
        Inf_0103_indexOf m = new Inf_0103_indexOf();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
