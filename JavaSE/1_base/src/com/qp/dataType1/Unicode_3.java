package com.qp.dataType1;

public class Unicode_3 {
    public static void main(String[] args) {


        // h 的 uincode  Unicode 编码为 104（十进制），68（十六进制）
        // i 的 uincode  Unicode 编码为 105（十进制），69（十六进制）

        String str1 = "hi𝕆";
        System.out.println(str1.length()); //4 -----字符串长度为4

        // codePointCount 返回码点数量
        System.out.println(str1.codePointCount(0, str1.length()));// 3 ------码点数目为3

        testCodePoint(str1);

    }

    private static void testCodePoint(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            System.out.println(Integer.toHexString(charAt));

/*			68
            69
			d835
			dd46*/
        }
        ;
        int codePointCount = str.codePointCount(0, length); // 3
        for (int i = 0; i < codePointCount; i++) {
            int charAt = str.codePointAt(i);
            System.out.println(Integer.toHexString(charAt));

/*			68    h 的 uincode  Unicode 编码为 104（十进制），68（十六进制）
			69    i 的 uincode  Unicode 编码为 105（十进制），69（十六进制）
			1d546*/
        }
    }
}
