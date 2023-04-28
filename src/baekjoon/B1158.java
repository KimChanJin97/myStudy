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

        System.out.print("<");
        while(!queue.isEmpty()) {
            for (int i = 0; i < K; i++) { // 0 ~ 2
                if(i == K-1) { // 0,1,2 즉 요세푸스 수 3일 때 queue에서 빼자
                    int yes = queue.remove();
                    if(queue.isEmpty()) {
                        System.out.print(yes);
                    } else {
                        System.out.print(yes + ", ");
                    }
                } else {
                    queue.add(queue.remove());
                }
            }
        }
        System.out.print(">");
    }
}
