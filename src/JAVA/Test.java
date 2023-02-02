package JAVA;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Case1
        String s1 = sc.next();
        String s2 = sc.nextLine();
        int i1 = sc.nextInt();

        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
        System.out.println("i1 " + i1);

        // Case2
        String s3 = sc.next();
        int i2 = sc.nextInt();
        String s4 = sc.nextLine();

        System.out.println("s3 " + s3);
        System.out.println("i2 " + i2);
        System.out.println("s4 " + s4);
    }
}