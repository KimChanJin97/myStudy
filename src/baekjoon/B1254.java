package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 팰린드롬 만들 필요없음. 하나씩 전진하면서 팰린드롬 검사.
        // 만약 팰린드롬 아니라면 추가할 문자개수 +1
        int answer = str.length();
        for(int i=0; i<str.length(); i++) {
            if(isPalind(str.substring(i))) {
                break; // 팰린드롬 발견하면 그만두기
            }
            answer++; // 팰린드롬 아니라면 문자개수+1
        }
        System.out.println(answer);
    }
    // 팰린드롬 검사
    public static boolean isPalind(String substringStr) {
        if(substringStr.equals(new StringBuilder(substringStr).reverse().toString())) {
            return true;
        }
        return false;
    }

}
