package com.qp.file3;

import java.io.UnsupportedEncodingException;

public class Encode_test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        test1(); //乱码
        test2(); //中国
    }

    public static void test1() throws UnsupportedEncodingException {
        String s1 = "中国";
        byte[] bytes = s1.getBytes();
        String s2 = new String(bytes,"GBK");
        System.out.println(s2);
    }

    public static void test2() throws UnsupportedEncodingException {
        String s1 = "中国";
        byte[] bytes = s1.getBytes();
        String s2 = new String(bytes,"UTF-8");
        System.out.println(s2);
    }
}
