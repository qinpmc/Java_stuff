package com.qp.file4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader_demo1 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test3(); // abcdefgh中文123
        test2();
    }

    //int read()
    public static void test1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fis.txt"));
        int chara = 0;
        while ((chara = isr.read())!= -1){
            System.out.print((char)chara);
        }
        isr.close();
    }

    //int read(char[] cbuf, int offset, int length)
    public static void test2() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fis.txt"));
        char[] chars = new char[4];
        int len = isr.read(chars,3,1);
        System.out.println(new String(chars));//a
        System.out.println(len);//1
        isr.close();
    }

    //int read()
    public static void test3() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fis.txt"));
        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars))!= -1){
            System.out.println(new String(chars,0,len));
        }
        isr.close();
    }

}
