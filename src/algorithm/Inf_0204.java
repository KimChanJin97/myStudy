package algorithm;

import java.util.Scanner;

public class Inf_0204 {
    public int[] solution(int n){
        int[] ia = new int[n];
        ia[0] = 1; ia[1] = 1; // [1, 1] 시작 고정

        for(int i=0; i<n-2; i++){ // 앞 2칸 소모했으니 뒤 2칸 제거
            ia[i+2] = ia[i] + ia[i+1];
        }

        return ia;
    }

    public static void main(String[] args) {
        Inf_0204 m = new Inf_0204();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i : m.solution(n)){
            System.out.print(i + " ");
        }
    }
}
