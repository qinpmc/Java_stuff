package com.qp.file2;

import java.io.FileOutputStream;
import java.io.IOException;

// write 三种方式
public class FileOutputStream_demo2 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    public static void test1() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write("Hello,IO.".getBytes());
        fos.write(97); // 97---a
        byte[] bys = {97,98,99,100,101,102};// a b c d e f
        fos.write(bys,2,2); // cd
        fos.close();
    }

    public static void test2() throws IOException {

    }
}
