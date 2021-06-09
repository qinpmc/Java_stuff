package com.qp.file7;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream_demo2 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }
    ////合并2个文件流
    private static void test1() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        FileInputStream fis2 = new FileInputStream("pw.txt");
        FileOutputStream fos = new FileOutputStream("out.txt");
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        int b;
        while((b= sis.read())!=-1){
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

    ////合并多个文件流
    private static void test2() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        FileInputStream fis2 = new FileInputStream("pw.txt");
        Vector<InputStream> v = new Vector<>();
        v.add(fis);
        v.add(fis2);
        Enumeration<InputStream> e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        FileOutputStream fos = new FileOutputStream("out2.txt");
        int b;
        while ((b= sis.read())!=-1) {
            fos.write(b);
        }
        fos.close();
        sis.close();
    }
}
