package com.qp.file2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream  FileOutputStream
public class FileInputStream_demo5 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    public static void test1() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt");
        int by ;
        //效率低
        while((by = fis.read())!=-1){
            fos.write(by);
        }
        System.out.println("copy over.");
        fis.close();
        fos.close();
    }

    public static void test2() throws IOException {
        FileInputStream fis = new FileInputStream("vido.avi");
        FileOutputStream fos = new FileOutputStream("copy.avi");

        //效率高
        byte[] bAry  = new byte[1024];
        int len;
        while((len = fis.read(bAry))!=-1) {
            fos.write(bAry, 0, len);
        }
        System.out.println("copy over.");
        fis.close();
        fos.close();
    }

    public static void test3() throws IOException {
        FileInputStream fis = new FileInputStream("vido.avi");
        FileOutputStream fos = new FileOutputStream("copy.avi");

        //输入文件过大，造成内存溢出
        byte[] bAry  = new byte[fis.available()];
        fis.read(bAry);
        fos.write(bAry);
        System.out.println("copy over.");
        fis.close();
        fos.close();
    }

}
