package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            line = br.readLine();
            if(line.equals(".")) {
                break;
            } else {
                System.out.println(isBalanced(line));
            }
        }
    }

    public static String isBalanced(String line) {
        Stack<Character> stack = new Stack<>();

        char[] charArr = line.toCharArray();

        for(char c : charArr) {
            if(c == '(' || c == '[') {
                stack.push(c);
            }
            // 닫는문자 ) 라면
            else if(c == ')') {
                // 스택에 ( 있는지 또는 스택이 비었는지 확인하고 그러하다면 no
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                }
                // 그러하지 않다면 즉, 짝이 맞다면 다음 짝을 찾으러 스택 비우기
                else {
                    stack.pop();
                }
            }
            // 닫는문자 ] 라면
            else if(c == ']') {
                // 스택에 [ 있는지 또는 스택이 비었는지 확인하고 그러하다면 no
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                }
                // 그러하지 않다면 즉, 짝이 맞다면 다음 짝을 찾으러 스택 비우기
                else {
                    stack.pop();
                }
            }
        }
        // 위 과정 후에 스택 비어있다면 짝이 맞는 것이기 때문에 yes
        if(stack.empty()) {
            return "yes";
        }
        // 위 과정 후에 스택에 뭔가 남아있다면 짝이 안맞는 것이기 때문에 no
        else {
            return "no";
        }
    }
}
