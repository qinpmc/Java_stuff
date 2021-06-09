package com.qp.operator;

public class operator_1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 5;

        boolean b = ((++x ==3) &(y++ ==4)); // x:4,y:5 ,b:false
        //boolean b = ((++x ==3) &&(y++ ==4));// x:4,y:4 ,b:false


        System.out.println(x); //4
        System.out.println(y); //4,y++并未执行
        System.out.println(b); //false

    }
}
