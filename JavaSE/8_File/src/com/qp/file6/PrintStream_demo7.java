package com.qp.file6;

import java.io.*;

public class PrintStream_demo7 {
    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }
    // BufferedReader + BufferedWriter
    private static void  test1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fis.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("fos.txt"));
        String s = null;
        while((s= br.readLine())!=null){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
    // PrintWriter +  BufferedReader
    private static void test2() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fis.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true);//自动刷新
        String s = null;
        while((s=br.readLine())!=null){
            pw.println(s);
        }
        br.close();
        pw.close();
    }
}
