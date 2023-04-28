package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 큐의 크기
        int M = sc.nextInt(); // 뽑아내려고 하는 수의 개수

        System.out.println(N);
        System.out.println(M);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) { // 토큰 있을 때동안만 반복
            System.out.println(st.nextToken());
        }
    }
}
