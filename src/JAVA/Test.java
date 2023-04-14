package JAVA;

import java.io.*;

public class Test{
    public static void main(String[] args) {
        File f = createFile(args[0]);
        System.out.println(f.getName() + "파일이 성공적으로 생성되었음");
    }

    static File createFile(String fileName){
        try{
            if(fileName==null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않음");
        } catch(Exception e){
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    static void createNewFile(File f){
        try{
            f.createNewFile();
        } catch(Exception e){}
    }
}

//package JAVA;
//
//        import java.io.*;
//
//public class Test{
//    public static void main(String[] args) {
//        try{
//            File f = createFile(args[0]);
//            System.out.println(f.getName() + "파일이 성공적으로 생성되었음");
//        } catch(Exception e){
//            System.out.println(e.getMessage() + " 다시 입력해야함");
//        }
//    }
//
//    static File createFile(String fileName) throws Exception{
//        if(fileName==null || fileName.equals(""))
//            throw new Exception("파일 이름이 유효하지 않음");
//        File f = new File(fileName);
//        f.createNewFile();
//        return f;
//    }
//}