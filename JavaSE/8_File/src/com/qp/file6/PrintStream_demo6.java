package com.qp.file6;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_demo6 {
    public static void main(String[] args) throws FileNotFoundException {
        test1();
        test2();
    }

    public static void test1() throws FileNotFoundException {
        PrintStream ps = new PrintStream("ps.out");
        ps.print(97); //97
        ps.write(97); //a    write​(int b) 将指定的字节写入此流
        ps.close();
    }
    public static void test2(){
        PrintStream ps2 = System.out; // 控制台输出
        ps2.print(97); //97
        ps2.write(97); //a
        ps2.close();
    }
}
