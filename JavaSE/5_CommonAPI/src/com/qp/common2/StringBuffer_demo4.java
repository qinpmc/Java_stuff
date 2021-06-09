package com.qp.common2;

//String不可变化
public class StringBuffer_demo4 {
    public static void main(String[] args) {
        String str  ="world";
        StringBuffer sb = new StringBuffer("world");
        changeStr(str);
        changeStrBuf(sb);
        System.out.println(str); //world ,String不可变化
        System.out.println(sb);  //worldhello，StringBuffer可变

    }
    public static void changeStr(String s){
        s +="hello";
    }
    public static void changeStrBuf(StringBuffer sb){
        sb.append("hello");
    }
}

