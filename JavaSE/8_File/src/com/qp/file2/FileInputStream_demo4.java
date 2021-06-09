package com.qp.file2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//FileInputStream
public class FileInputStream_demo4 {
    public static void main(String[] args) throws IOException {
        test1();
        //test2();
    }

    public static void test1() throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt");
        int by ;
        //效率低
        while((by = fis.read())!=-1){
            fos.write(by);
        }
        System.out.println("copy over.");
        fis.close();
        fos.close();
    }

    public static void test2(){
        String str1  = "abcd";
        byte[] b1 = str1.getBytes();
        System.out.println(Arrays.toString(b1));
        //[97, 98, 99, 100]

        String str2  = "中国";
        byte[] b2 = str2.getBytes();
        System.out.println(Arrays.toString(b2));
        //[-28, -72, -83, -27, -101, -67]
    }

}
