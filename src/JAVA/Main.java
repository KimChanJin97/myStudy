package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> al = new ArrayList<>();
        for(String s : str){
            String tmp = new StringBuilder(s).reverse().toString();
            al.add(tmp);
        }
        return al;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = sc.next(); // arraylist에 담기
        }
        for(String s : m.solution(n, str)){
            System.out.println(s);
        }
    }
}