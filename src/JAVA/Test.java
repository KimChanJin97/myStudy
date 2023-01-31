package JAVA;

public class Test{


    public static void main(String[] args) {
        System.out.println("java197@gamil.com java2@naver.com".replaceAll("\\w+@\\w+\\.\\w+(\\.\\w+)?","#"));
        // \\w
        System.out.println("a1b2c3d4".replaceAll("[a-z]","<$0>"));
        // <a>1<b>2<c>3<d>4

    }
}