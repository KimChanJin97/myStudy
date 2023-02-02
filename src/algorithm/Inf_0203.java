package algorithm;

import java.util.Scanner;

public class Inf_0203 {
    public char[] solution(int n, int[] A, int[] B){
        char[] ca = new char[n];
        // 가위1 바위2 보3

        // A가 이긴 경우를 기준으로 삼자
        // A가 이긴 경우 A 출력
        // A와 B 비긴 경우 D 출력
        // 나머지 경우 B 출력

        // [1,3 -> 1]
        // [2,1 -> 2]
        // [3,2 -> 3]

        for(int i=0; i<n; i++){
            if(A[i]==1 && B[i]==3){ // A가 가위내서 이긴 경우
                ca[i] = 'A';
            } else if(A[i]==2 && B[i]==1){ // A가 바위내서 이긴 경우
                ca[i] = 'A';
            } else if(A[i]==3 && B[i]==2){ // A가 보내서 이긴 경우
                ca[i] = 'A';
            } else if(A[i] == B[i]){ // A와 B가 비긴 경우
                ca[i] = 'D';
            } else{ // 나머지 경우
                ca[i] = 'B';
            }
        }
        return ca;
    }

    public static void main(String[] args) {
        Inf_0203 m = new Inf_0203();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }

        for(char c : m.solution(n, A, B)){
            System.out.println(c);
        }

    }
}
