package com.qp.common;

public class String_demo_4 {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    public static void test1(){
        String s = new String();
        System.out.println("s:"+s); // s:
        System.out.println("s.length:"+s.length()); //s.length:0
    }

    public static void test2(){
        byte[] bytes = {97,98,99,100};
        String s = new String(bytes);
        System.out.println("s:"+s); // s:abcd
        System.out.println("s.length:"+s.length()); //s.length:4
    }

    public static void test3(){
        char[] chars = {'a','b','c'};
        String s = new String(chars);
        System.out.println("s:"+s); // s:abc
        System.out.println("s.length:"+s.length()); //s.length:3
    }
}
