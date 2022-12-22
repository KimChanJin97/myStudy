import java.util.Scanner;

public class Inf_0101 {
    public int solution(String str, char t){
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // System.out.println(str+" "+t);

        /* solution 1
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == t) answer++;
        }
        */

        // improved 1 : for each문
        for (char x: str.toCharArray()){
            if (x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Inf_0101 M = new Inf_0101();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(M.solution(str, c));
    }
}