package com.qp.file4;

import java.io.*;

// BufferedReader BufferedWriter
public class Reader_Writer_demo5 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("fis.txt"));
        BufferedWriter bw =  new BufferedWriter(new FileWriter("fos.txt"));
        int len = 0;
        char[] chars = new char[1024];
        while ((len = br.read(chars))!= -1){
            bw.write(chars,0,len);
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
