package com.qp.file5;

import java.io.*;

//  LineNumberReader
public class LineNumberReader2 {
    public static void main(String[] args) throws IOException {
        test1();
    }

    public static void test1() throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("fis.txt"));
        BufferedWriter bos = new BufferedWriter(new FileWriter("fos.txt"));

        lnr.setLineNumber(10);

        String line = null;
        while ((line =lnr.readLine())!=null){
            bos.write(""+lnr.getLineNumber());
            bos.write(":");
            bos.write(line);
            bos.newLine();
        }
        lnr.close();
        bos.close();
    }
}
