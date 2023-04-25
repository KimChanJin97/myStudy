package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String[] str = br.readLine().split(" ");
            System.out.print("Case #" + (i+1) + ": ");

            for(int j=str.length-1; j>=0; j--) {
                System.out.print(str[j] + " ");
            }
            System.out.println();
        }
    }
}
