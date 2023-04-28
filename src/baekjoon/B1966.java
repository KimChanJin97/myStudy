package baekjoon;

import java.io.IOException;
import java.util.*;

public class B1966 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i=0; i<testCases; i++) {
            int N = sc.nextInt(); // 문서의 개수
            int M = sc.nextInt(); // 인쇄하고 싶은 문서의 인덱스
            int count = 0; // 인쇄 순번

            Queue<Doc> queue = new LinkedList<>();

            for(int j=0; j<N; j++) {
                if(j == M) {
                    Doc doc = new Doc(j, sc.nextInt()); // new Doc(index, priority)
                    doc.setWanted(true); // 내가 원하는 문서임을 표시
                    queue.add(doc);
                } else {
                    Doc doc = new Doc(j, sc.nextInt()); // new Doc(index, priority)
                    queue.add(doc);
                }
            }

            while(true) {
                Doc front = queue.remove(); // queue 맨 앞 하나 꺼내서 비교할거야
                boolean isFrontPriorityBigger = true;

                for(Doc doc : queue) {
                    if(doc.getPriority() > front.getPriority()) { // 만약 front의 우선순위가 낮다면
                        isFrontPriorityBigger = false;
                        break; // 반복문2 탈출
                    }
                }

                // 만약 front의 우선순위가 낮다면 isFrontPriorityBigger은 false, 높다면 true
                if(isFrontPriorityBigger) { // front의 우선순위가 높다면
                    count++;
                    if(front.getWanted()) break; // front가 내가 원했던 문서라면 반복문 탈출
                } else { // front의 우선순위가 낮다면
                    queue.add(front); // front를 queue 맨뒤로 이동
                }
            }

            System.out.println(count);
        }
    }
}

class Doc {
    private int index = 0;
    private int priority = 0;
    private boolean wanted = false;

    public Doc(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public boolean getWanted() {
        return wanted;
    }

    public void setWanted(boolean wanted) {
        this.wanted = wanted;
    }
}