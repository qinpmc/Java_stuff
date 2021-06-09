package com.qp.dataType1;

public class DataTransfer_4_1 {
    public static void main(String[] args) {
        int x = 3;
        byte b = 4;
        x = x + b;
        System.out.println(x); //7

        int x2 = 3;
        byte b2 = 4;
        b2 = (byte) (x2 + b2);
        System.out.println(b2); //7
    }
}
