package com.qp.file4;

import java.io.*;

public class Reader_Writer_demo3 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fis.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fos.txt"));
        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars))!= -1){
            osw.write(chars,0,len);
            osw.flush();
        }
        isr.close();
        osw.close();
    }
}
