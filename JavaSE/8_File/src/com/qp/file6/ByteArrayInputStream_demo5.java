package com.qp.file6;

import java.io.*;

// https://www.shadowwu.club/2018/11/15/java_io2/index.html
// 需要对同一个InputStream对象使用多次。比如，既要把数据显示到前台（第一次读取），又想把数据写进文件缓存到本地（第二次读取）。
// 但第一次读取InputStream对象后，第二次再读取时可能已经到Stream的结尾了（EOFException）或者Stream已经close掉了。
// 而InputStream对象本身不能复制，因为它没有实现Cloneable接口。此时，可以先把InputStream转化成ByteArrayOutputStream，
// 后面要使用InputStream对象时，再从ByteArrayOutputStream转化回来就好了
// 同一个流，进行了两次的输出，不必进行两次读取，通过ByteArrayInputStream和ByteArrayOutputStream的转换
public class ByteArrayInputStream_demo5 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try {
            InputStream input = new FileInputStream("fis.txt");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = input.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            baos.flush();

            // 显示到前台
            InputStream stream1 = new ByteArrayInputStream(baos.toByteArray());
            OutputStream out = System.out;
            byte[] buffer2 = new byte[1024];
            int count = 0;

            while ((count = stream1.read(buffer2)) != -1) {
                out.write(buffer2, 0, count);
            }

            //  本地缓存
            InputStream stream2 = new ByteArrayInputStream(baos.toByteArray());
            OutputStream out2 = new FileOutputStream("out1.txt");
            byte[] buffer3 = new byte[1024];
            int count2 = 0;

            while ((count2 = stream2.read(buffer2)) != -1) {
                out2.write(buffer2, 0, count2);
            }
            out2.close();
            out.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
