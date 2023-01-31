package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf_0104 {
    public ArrayList<String> solution(String[] str){
        ArrayList<String> al = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            al.add(tmp);
        }
        return al;
    }

    public static void main(String[] args) {
        Inf_0104 m = new Inf_0104();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] sa = new String[num];

        for(int i=0; i<num; i++){
            sa[i] = sc.next();
        }
        for(String x : m.solution(sa)){
            System.out.println(x);
        }
    }
}
