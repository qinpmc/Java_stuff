package com.qp.common;

public class String_demo_6 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1+s2); //false  字符串是变量相加，先开空间，然后拼接；
        System.out.println(s3.equals(s1+s2)); //true
        System.out.println(s3 == "hello"+"world"); //true  如果是常量相加，先拼接，在常量池中找，如果有直接用，否则就创建
        System.out.println(s3.equals("hello"+"world")); //true
    }
}
