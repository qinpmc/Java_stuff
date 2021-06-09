package com.qp.file4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriter_demo2 {
    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3(); //

    }

    //void write(int)
    public static void test1() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fos.txt"));
        osw.write(97); //a
        osw.flush();
        osw.close();
    }

    //void write(char[] cbuf, int off, int len)
    public static void test2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fos.txt"));
        char[] cbuf = {98,99,100,101,102,103};//bcdefg
        osw.write(cbuf,1,2); // cd
        osw.flush();
        osw.close();
    }

    //void write(String str, int off, int len)
    public static void test3() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fos.txt"));
        String str="abcdefg";
        osw.write(str,2,3); // cde
        osw.flush();
        osw.close();
    }
}
