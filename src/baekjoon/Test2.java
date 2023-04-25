package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Member;
import java.util.*;

public class Test2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(0,1,2,3,4));

        arrayList.add(0, -1);

        for(int i : arrayList) {
            System.out.print(i);
        }
    }
}

