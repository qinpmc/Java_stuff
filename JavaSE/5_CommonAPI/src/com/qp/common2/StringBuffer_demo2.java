package com.qp.common2;


// StringBuffer append insert
public class StringBuffer_demo2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello").append(123).append('中');
        System.out.println(sb1); // hello123中

        sb1.insert(5,"world");
        System.out.println(sb1); // helloworld123中
    }
}
