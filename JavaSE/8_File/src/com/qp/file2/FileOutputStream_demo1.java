package com.qp.file2;

import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream
public class FileOutputStream_demo1 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write("Hello,IO".getBytes());
        fos.write("Java".getBytes());
        fos.close();
    }
}
