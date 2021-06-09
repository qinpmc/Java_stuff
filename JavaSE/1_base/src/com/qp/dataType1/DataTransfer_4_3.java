package com.qp.dataType1;

public class DataTransfer_4_3 {
    public static void main(String[] args) {
        byte b1 =3;
        //b1 = b1+3; // 编译错误

        b1++;   //3 ，隐含强制类型转换
        System.out.println(b1); //4

        b1+=3;  //隐含强制类型转换
        System.out.println(b1); //7

        byte b4 = 1+2; //3
        byte b5 = 2*2; //4
        b5*=2;
        System.out.println(b5); //8
        //byte b6 = b5*b4;  // 编译错误




    }
}
