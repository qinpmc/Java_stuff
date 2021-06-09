package com.qp.operator;

public class operator_3 {
    public static void main(String[] args) {
        int x = -2;
        x = x<<2;
        System.out.println(x);  //-8

        int x2 = 2;
        x2 = x2<<2;
        System.out.println(x2);  //8

        int x3 = -21;
        x3 = x3>>2;
        System.out.println(x3);  //-6
        System.out.println(-21/4); //-5

        int x4 = 21;
        x4 = x4>>2;
        System.out.println(x4);  //5


        int x33 = -21;
        x33 = x33>>>2;
        System.out.println(x33);  //1073741818


        int x44 = 21;
        x44 = x44>>>2;
        System.out.println(x44);  //5
    }
}
