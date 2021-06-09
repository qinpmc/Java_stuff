package com.qp.common2;

// StringBuffer 构造函数
public class StringBuffer_demo1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); //16

        StringBuffer sb2 = new StringBuffer(2);
        System.out.println(sb2.capacity()); // 2
        sb2.append("abcdefg");
        System.out.println(sb2.capacity());// 7

        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println(sb3.capacity()); // 21 = 16+5
    }
}
