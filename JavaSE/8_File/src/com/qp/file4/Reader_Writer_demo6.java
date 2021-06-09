package com.qp.file4;

import java.io.*;
import java.util.ArrayList;

// BufferedReader BufferedWriter readLine newLine
public class Reader_Writer_demo6 {
    public static void main(String[] args) throws IOException {
        //test1();
        reverseText();
    }

    public static void test1() throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("fis.txt"));
        BufferedWriter bw =  new BufferedWriter(new FileWriter("fos.txt"));
        String line = null;
        while ((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }

    public static void reverseText() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("fis.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("fos.txt"));
        String line = null;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine())!=null){
            list.add(line);
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            bw.write(list.get(i));
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
