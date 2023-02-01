package algorithm;

import java.util.Scanner;

public class Inf_0112_replaceAll {
    // ASCII codePoint
    // 0~9: 48~57 (총 10개)
    // A~Z: 65~90 (총 26개)
    // A~a 사이 거리 32
    // a~z: 97~122 (총 26개)
    // 대문자 신호이므로 65~90을 표현하기 위해 최소 7비트 필요. 2^6=64, 2^7=128
    public String solution(int n, String str){
        String answer = "";
        str = str.replaceAll("#","1").replaceAll("\\*", "0");

        for(int i=0; i<n; i++){
            String tmp = str.substring(0, 7); // 문자 7개 떼서 (시작idx부터 끝idx 이전까지)
            answer += (char)Integer.parseInt(tmp, 2); // 2진수로 보고 해석해서 정수로 반환하고 문자열에 더하기
            str = str.substring(7); // 해석한 문자 7개 제거 (시작idx 이전 삭제)
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf_0112_replaceAll m = new Inf_0112_replaceAll();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(m.solution(n, str));
    }
}
