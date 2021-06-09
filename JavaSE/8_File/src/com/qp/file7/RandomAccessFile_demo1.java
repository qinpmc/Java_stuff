package com.qp.file7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_demo1 {
    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }
    private static void test1() throws IOException {
        File f = new File("raf1.txt");
        RandomAccessFile raf = new RandomAccessFile("raf1.txt", "rw");

        String name ="zhangsan"; // 8个字节
        System.out.println(name.getBytes().length); // 8
        int age=30; // int  4 个字节
        raf.writeBytes(name);
        raf.writeInt(age);
        name ="lisi    ";  // 8个字节
        age=31; // int  4 个字节
        raf.writeBytes(name);
        raf.writeInt(age);
        name ="wangwu  ";  // 8个字节
        age=32;
        raf.writeBytes(name);
        raf.writeInt(age);// int  4 个字节

        raf.writeBytes("哈哈");
        raf.writeInt(30);
        raf.writeChar('a');
        raf.writeUTF("中国");
        raf.close();
    }

    private static void test2() throws IOException {
        RandomAccessFile raf2 =new RandomAccessFile("raf1.txt", "rw");
        byte[] b2 = new byte[8];
        raf2.skipBytes(12);
        for (int i = 0; i < b2.length; i++) {
            b2[i] = raf2.readByte();
        }
        String name2 = new String(b2);
        int age2 = raf2.readInt();
        System.out.println(name2); // lisi
        System.out.println(age2);  // 31

        raf2.seek(0);
        for (int i = 0; i < b2.length; i++) {
            b2[i] = raf2.readByte();
        }
        name2 = new String(b2);
        age2 = raf2.readInt();
        System.out.println(name2); // zhangsan
        System.out.println(age2);  // 30

    }
}
