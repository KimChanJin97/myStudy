package algorithm;

import java.util.Scanner;

public class Inf_0102 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else{
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Inf_0102 M = new Inf_0102();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(M.solution(str));
    }
}

//import java.util.Scanner;
//
//public class JAVA.Main {
//    public String solution(String str){
//        String answer = "";
//        for(char x : str.toCharArray()){
//            if(x>=65 && x<=90){ // A ~ Z, 총 26개
//                answer += (char)(x+32);
//            } else if(x>=97 && x<=122){ // a ~ z, 총 26개
//                answer += (char)(x-32);
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        JAVA.Main M = new JAVA.Main();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.print(M.solution(str));
//    }
//
//}