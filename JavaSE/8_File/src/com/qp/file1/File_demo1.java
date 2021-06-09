package com.qp.file1;

import java.io.File;
import java.io.IOException;

public class File_demo1 {
    public static void main(String[] args) throws IOException {
        // test1();
        // test2();
        // test3();
        test4();
    }

    public  static  void  test1(){
        String path = "F:\\notes\\java";
        File f1 = new File(path);
        System.out.println(f1.isDirectory()); //true
        System.out.println(f1.exists());   //true
    }
    public  static  void  test2(){
        String path = "F:\\notes\\java";
        String child = "file.txt";

        File parentFile = new File(path);
        File f2 = new File(parentFile,child);
        System.out.println(f2.isDirectory());//false
        System.out.println(f2.isFile());//true
        System.out.println(f2.exists());   //true
    }

    public  static  void  test3() throws IOException {
        String path = "F:\\notes\\java\\file2.txt";

        File file4 = new File(path);
        if(!file4.exists()){
            file4.createNewFile();
        }else{
            file4.delete();
        }
    }

    public  static  void  test4(){
        String dir= "F:\\notes\\java\\test\\aa";
        File fdir = new File(dir);
        // fdir 父目录必须存在
        System.out.println(fdir.mkdir());//false

        System.out.println(fdir.mkdirs()); //true
    }

}
