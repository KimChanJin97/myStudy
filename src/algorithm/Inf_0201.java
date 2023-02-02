package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf_0201 {
    public ArrayList<Integer> solution(int n, int[] ia){
        // n = 6
        // ia = [7, 3, 9, 5, 6, 12]

        // 내가 앞보다 크면 나 출력
        // 7395612
        // 01234 5

        ArrayList<Integer> alInt = new ArrayList<>();
        alInt.add(ia[0]);

        for(int i=1; i<n; i++){
            if(ia[i] > ia[i-1]){
                alInt.add(ia[i]);
            }
        }
        return alInt;
    }

    public static void main(String[] args) {
        Inf_0201 m = new Inf_0201();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 6
        int[] ia = new int[n];
        for(int i=0; i<n; i++){
            ia[i] = sc.nextInt(); // [7, 3, 9, 5, 6, 12]
        }

        for(int i : m.solution(n, ia)){
            System.out.print(i + " ");
        }
    }
}
