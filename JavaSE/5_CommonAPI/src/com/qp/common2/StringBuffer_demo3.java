package com.qp.common2;

// 反转字符  判断字符串是否对称
public class StringBuffer_demo3 {
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println(reverseString(s1)); //dcba
        System.out.println(reverseString2(s1)); //dcba

        System.out.println(isSymmetry("abc")); // false
        System.out.println(isSymmetry("abcba")); // true
    }

    public static String reverseString(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static String reverseString2(String str){
        StringBuffer sb = new StringBuffer();
        for(int length = str.length(),i=length-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //字符串是否对称
    public static boolean isSymmetry(String str){
        return new StringBuffer(str).reverse().toString().equals(str);
    }

}

