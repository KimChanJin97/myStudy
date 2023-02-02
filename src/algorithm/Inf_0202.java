package algorithm;

import java.util.Scanner;

public class Inf_0202 {
    public int solution(int n, int[] ia){
        int std = ia[0]; // 첫사람부터 시작을 기준
        int cnt = 1; // 첫사람은 무조건 보이니깐 cnt=1부터 시작

        // 130 135 148 140 145 150 150 153
        for(int i=1; i<n; i++){
            if(std < ia[i]){ // 나보다 크면
                cnt++; // 카운트
                std = ia[i]; // 그걸 기준으로 정하기
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Inf_0202 m = new Inf_0202();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ia = new int[n];
        for(int i=0; i<n; i++){
            ia[i] = sc.nextInt();
        }
        System.out.println(m.solution(n, ia));
    }
}
