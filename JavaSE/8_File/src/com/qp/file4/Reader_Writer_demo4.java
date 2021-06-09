package com.qp.file4;

import java.io.*;

// FileReader FileWriter
public class Reader_Writer_demo4 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException {
        FileReader fr =  new FileReader("fis.txt");
        FileWriter fw =  new FileWriter("fos.txt");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = fr.read(chars))!= -1){
            fw.write(chars,0,len);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
