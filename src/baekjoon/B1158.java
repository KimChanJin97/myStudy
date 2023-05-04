package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1158 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수 7
        int K = sc.nextInt(); // 요세푸스 수 3

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");

        for (int i = 0; i < N; i++) { // 0 ~ 6
            queue.add(i + 1); // 1번 ~ 7번
        }

        for (int i = 0; i < K; i++) { // 0 ~ 2
            if(i == K-1) { //
                i = 0; //
                sb.append(queue.remove() + ", ");
            }

            if(!queue.isEmpty()) {
                int not = queue.remove();
                queue.add(not);
            } else {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(">");
        System.out.print(sb);
    }
}
