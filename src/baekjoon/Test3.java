package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test3 {
    static Stack<Character> leftStack = new Stack<>();
    static Stack<Character> rightStack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();

        for (char c : charArr) {
            leftStack.push(c);
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] strArr = br.readLine().split(" "); // L, D, B, P $
            editor(strArr); // 경우에 따라 실행
        }

        // leftStack에서 꺼내면 반대순서로 꺼내지게 되기 때문에
        // rightStack으로 옮겨서 꺼내야 함
        StringBuilder sb = new StringBuilder();
        while (!leftStack.isEmpty()) { // leftStack 비어있지 않는 동안 반복
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) { // rightStack 비어있지 않는 동안 반복
            sb.append(rightStack.pop());
        }
        System.out.println(sb.toString());
    }

    public static void editor(String[] instruction) {
        switch (instruction[0]) {
            case "L":
                if (!leftStack.isEmpty()) { // leftStack 비어있지 않다면 (커서가 맨 앞이 아니라면)
                    rightStack.push(leftStack.pop()); // leftStack 하나 비워서 rightStack 으로 하나 옮기기 (커서를 왼쪽으로 한칸 옮김)
                }
                break;
            case "D":
                if (!rightStack.isEmpty()) { // rightStack 비어있지 않다면 (커서가 맨 뒤가 아니라면)
                    leftStack.push(rightStack.pop()); // rightStack 하나 비워서 rightStack 으로 하나 옮기기
                }
                break;
            case "B":
                if (!leftStack.isEmpty()) { // leftStack 비어있지 않다면 (커서가 맨 앞이 아니라면)
                    leftStack.pop(); // leftStack 하나 삭제
                }
                break;
            case "P":
                leftStack.push(instruction[1].charAt(0)); // stack의 지네릭이 Character라 charAt으로 캐스팅
                break;
        }
    }
}
