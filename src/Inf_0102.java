import java.util.Scanner;

public class Inf_0102 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else{
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Inf_0102 M = new Inf_0102();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(M.solution(str));
    }
}