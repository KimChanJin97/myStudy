package algorithm;

import java.util.Scanner;

public class Inf_0112_replace {
    // ASCII codePoint
    // 0~9: 48~57 (총 10개)
    // A~Z: 65~90 (총 26개)
    // A~a 사이 거리 32
    // a~z: 97~122 (총 26개)
    // 대문자 신호이므로 65~90을 표현하기 위해 최소 7비트 필요. 2^6=64, 2^7=128
    public String solution(int n, String str){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0112_replace m = new Inf_0112_replace();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(m.solution(n, str));
    }
}
