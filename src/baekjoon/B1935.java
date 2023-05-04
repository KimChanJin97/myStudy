package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1935 {
    public static void main(String[] args) throws IOException {
        Stack<Double> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int operandNum = Integer.parseInt(br.readLine()); // 5
        String expression = br.readLine(); // ABC*+DE/-

        int[] arr = new int[operandNum]; // 피연산자 개수
        for(int i=0; i<operandNum; i++) { // 1,2,3,4,5
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch >= 'A' && ch <= 'Z') { // A=65, B=66, C=67 ... Z=90
                stack.push((double)arr[ch-'A']); // arr[0], arr[1] ... arr[4]
            } else {
                double operand1 = stack.pop(); // 뒤 피연산자
                double operand2 = stack.pop(); // 앞 피연산자
                // [앞 피연산자] [연산자] [뒤 피연산자]
                stack.push(calculate(ch, operand1, operand2));
            }
        }
        System.out.printf("%.2f", stack.peek());
    }

    public static double calculate(char operator, double operand1, double operand2) {
        if(operator == '+') {
            return operand2 + operand1;
        } else if (operator == '-') {
            return operand2 - operand1;
        } else if (operator == '*') {
            return operand2 * operand1;
        } else {
            return operand2 / operand1;
        }
    }
}
