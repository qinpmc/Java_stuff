package com.qp.file2;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream
public class FileInputStream_demo3 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    public static void test1() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        int by = fis.read();
        while(by!=-1){
            System.out.println((char)by);
            by = fis.read();
        }
        fis.close();
    }

    public static void test2() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        int by ;
        while((by = fis.read())!=-1){
            System.out.println((char)by);
        }
        fis.close();
    }

}
