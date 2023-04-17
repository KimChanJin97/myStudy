package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // ababc

        // Set에 담을 준비
        Set strSet = new HashSet();

        // 서로 다른 부분 문자열을 Set에 담기
        for(int i=0; i<=str.length(); i++) { // substring 때문에 "<=" 사용
            for(int j=i+1; j<=str.length(); j++) {
                strSet.add(str.substring(i, j)); // j(end)는 포함하지 않기 때문
            }
        }

        System.out.println(strSet.size());

    }
}
