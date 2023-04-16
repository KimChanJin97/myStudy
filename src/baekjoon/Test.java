package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 체스판 다시 칠하기
public class Test {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        // 1. String ex) Hello World -> "Hello World"
//        String str1 = br.readLine();
//        System.out.println(str1);

        // 2. String[] ex) Hello World -> {"Hello", "World"}
//        String[] strArr = br.readLine().split(" ");
//        for(String s : strArr) {
//            System.out.println(s);
//        }

        // 3. int ex) 3 -> 3
//        int i = Integer.parseInt(br.readLine());
//        System.out.println(i);

        // 4. int[] ex) 1 -2 3 -4 5 -> {1, -2, 3, -4, 5}
        String[] strArr = br.readLine().split(" ");


        // 4. int[] & sort() ex) 1 -2 3 -4 5 -> {-4, -2, 1, 3, 5}

    }
}
