package com.qp.dataType1;

public class CharTest_1_2 {
    public static void main(String[] args) {

        char cc1 = 97;
        char cc2 = 'a';

        // idea快捷键 sout
        System.out.println(cc1); //a
        System.out.println(cc2); //a

        System.out.println('a'+1);  //98
        System.out.println((char)('a'+1)); //b

        // char 类型 取值范围 0~65535

        char c1 = 'a';
        System.out.println(c1); //a

        char c2 = 97;
        System.out.println(c2); //a

        char c3 =(char) (c1+2); //必须转换

        char c4 = ++c1;
        System.out.println(c4);  //b
        c4 +=2;
        System.out.println(c4);  //d

        System.out.println("hello"+'a'+1); //helloa1
        System.out.println('a'+1+"hello"); //98hello

    }
}
