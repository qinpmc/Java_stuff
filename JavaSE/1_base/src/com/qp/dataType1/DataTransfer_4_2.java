package com.qp.dataType1;

public class DataTransfer_4_2 {
    public static void main(String[] args) {
        byte b1 =3;
        byte b2 =4;
        //byte b3 = b1+b2; //错误，编译不通过
        byte b3 = (byte) (b1+b2);
        System.out.println(b3); //7

        byte b4 =3+4;  //正确
        System.out.println(b4); //7


        // byte b5 = (250+256);  //错误，编译不通过
        byte b5 = (byte) (250+256); //溢出
        System.out.println(b5);  //-6
    }
}
