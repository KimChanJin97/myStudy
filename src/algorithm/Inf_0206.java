package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf_0206 {
    public boolean isPrime(int num){
        // 소수는 자기 자신과 1만을 약수로 가진 수
        // 만약 자기 자신이 다른 수로 나누어 떨어진다는 것은 소수가 아니라는 것
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] ia){
        ArrayList<Integer> alInt = new ArrayList<>();
        // 1230 -> 0321

        // tmp = 1230
        // tmp%10 = 1230%10 = 0
        // tmp = tmp/10 = 1230/10 = 123
        // tmp%10 = 123%10 = 3
        // tmp = tmp/10 = 123/10 = 12
        // tmp%10 = 12%10 = 2
        // tmp = tmp/10 = 12/10 = 1
        // tmp%10 = 1%10 = 1
        // tmp = tmp/10 = 1/10 = 0
        for(int i=0; i<n; i++){
            int tmp = ia[i];
            int res = 0;
            while(tmp>0){ // 숫자 뒤집기
                int t = tmp%10; // 0, 3, 2, 1 하나씩 제거
                res = res*10 + t; // 0, 03, 032, 0321 뒤집어서 붙이기
                tmp = tmp / 10; // 0, 3, 2, 1 하나씩 제거한 값 즉, 1230, 123, 12, 1
            }
            // 뒤집은 숫자가 소수인지 판단하고 add
            if(isPrime(res)) alInt.add(res);
        }

        return alInt;
    }

    public static void main(String[] args) {
        Inf_0206 m = new Inf_0206();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ia = new int[n];
        for(int i=0; i<n; i++){
            ia[i] = sc.nextInt();
        }
        for(int x : m.solution(n, ia)){
            System.out.print(x + " ");
        }
    }
}