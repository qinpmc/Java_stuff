package com.qp.file6;

import java.io.*;

public class ByteArrayInputStream_demo4 {
    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }

    public static void test1() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int b;
        while((b= fis.read())!=-1){
            baos.write(b); //写入到内存流中
        }
/*		byte[] bary = baos.toByteArray();
		String s = new String(bary);*/
        String s = baos.toString();
        System.out.println(s); //你好啊
    }

    public static void test2() throws IOException {
        byte[] bin = "测试".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bin); //bin -->“输入源”
        FileOutputStream fos = new FileOutputStream("bios.txt");
        int n;
        while((n= bais.read())!=-1){
            fos.write(n); //
        }
        bais.close();
        fos.close();

    }
}
