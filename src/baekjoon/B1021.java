package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1021{
    static Deque<Integer> deque = new LinkedList();
    static Deque<Integer> deque2 = new LinkedList();
    static Deque<Integer> deque3 = new LinkedList();

    static int answer = 0;

    // 연산1: removeFirst
    static public void method1(Deque<Integer> dequeN) {
        dequeN.removeFirst();
    }

    // 연산2: removeFirst + addLast
    static public void method2(Deque<Integer> dequeN) {
        int tmp = dequeN.removeFirst();
        dequeN.addLast(tmp);
    }

    // 연산3: removeLast + addFirst
    static public void method3(Deque<Integer> dequeN) {
        int tmp = dequeN.removeLast();
        dequeN.addFirst(tmp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 수의 개수

        for(int i=0; i<N; i++) {
            deque.add(i+1);
            deque2.add(i+1);
            deque3.add(i+1);
        }

        st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) { // 토큰 존재할 동안만 반복
            int num = Integer.parseInt(st.nextToken()); // 2, 9, 5

            int method2 = 0;
            int method3 = 0;

            if(num == deque.getFirst()) { // 1트부터 맨앞요소가 내가 원하는 값이라면
                method1(deque);
                method1(deque2);
                method1(deque3);
            }
            else { // 맨앞요소가 내가 원하는 값이 아니라면 method2와 method3를 각각 실행해서 최소 실행횟수 구하기
                while(num != deque2.getFirst()) { // 맨앞요소가 내가 원하는 값이 아닐 동안 반복 = 맨앞요소가 내가 원하는 값이 나오면 반복 종료
                    method2(deque2); // removeFirst + addLast
                    method2 += 1;
                }
                while(num != deque3.getFirst()) { // 맨앞요소가 내가 원하는 값이 아닐 동안 반복 = 맨앞요소가 내가 원하는 값이 나오면 반복 종료
                    method3(deque3); // removeLast + addFirst
                    method3 += 1;
                }

                if(method2 < method3) { // method2 실행횟수 < method3 실행횟수 이라면
                    answer += method2;
                    method1(deque2); // removeFirst
                    deque.clear();
                    deque3.clear();
                    for(int i : deque2) { // 동기화
                        deque.add(i);
                        deque3.add(i);
                    }
                } else {
                    answer += method3;
                    method1(deque3); // removeFirst
                    deque.clear();
                    deque2.clear();
                    for(int i : deque3) { // 동기화
                        deque.add(i);
                        deque2.add(i);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
