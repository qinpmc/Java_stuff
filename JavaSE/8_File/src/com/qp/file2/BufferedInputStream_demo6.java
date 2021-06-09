package com.qp.file2;

import java.io.*;

//BufferedInputStream  BufferedOutputStream
public class BufferedInputStream_demo6 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        //test1("vido.avi","copy.avi"); // 72
        test2("vido.avi","copy.avi"); // 46

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void test1(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] bAry  = new byte[1024];
        int len;
        while((len = fis.read(bAry))!=-1) {
            fos.write(bAry, 0, len);
        }
        System.out.println("copy over.");
        fis.close();
        fos.close();
    }

    public static void test2(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] bAry  = new byte[1024];
        int len;
        while((len = bis.read(bAry))!=-1) {
            bos.write(bAry, 0, len);
        }
        System.out.println("copy over.");
        bis.close();
        bos.close();
    }
}
