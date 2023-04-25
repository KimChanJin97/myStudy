package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1138 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] intArr = new int[N];
        for(int i=0; i<N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> answer = new ArrayList<>(N);
        // index  0 1 2 3 4 5 6
        // intArr 6 1 1 1 2 0 0
        for(int i=N-1; i>=0; i--) {
            answer.add(intArr[i], i+1);
            // add(intArr[6], 6+1) -> add(0, 7) -> [7]
            // add(intArr[5], 5+1) -> add(0, 6) -> [6, 7]
            // add(intArr[4], 4+1) -> add(2, 5) -> [6, 7, 5]
            // add(intArr[3], 3+1) -> add(1, 4) -> [6, 4, 7, 5]
            // add(intArr[2], 2+1) -> add(1, 3) -> [6, 3, 4, 7, 5]
            // add(intArr[1], 1+1) -> add(1, 2) -> [6, 2, 3, 4, 7, 5]
            // add(intArr[0], 0+1) -> add(6, 1) -> [6, 2, 3, 4, 7, 5, 1]
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }
    }
}