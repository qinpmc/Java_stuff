package com.qp.exception3;

public class Exercise_demo2 {
    public static void main(String[] args) {
        System.out.println(test1()); //30
        System.out.println(test2()); //40
        System.out.println(test3()); //40
    }

    public static int test1(){
        int x = 10;
        try {
            x =20;
            System.out.println(1/0);
            return x;  //上一句异常，此句不执行
        } catch (Exception e) {
            x=30;
            return x;  //30 建立返回通道，并将x=30封装，
        }finally{
            x=40;    //会执行该语句，但返回通道里的x并未被修改
        }
    }


    public static int test2(){
        int x = 10;
        try {
            x =20;
            System.out.println(1/0);
        } catch (Exception e) {
            x=30;
        }finally{
            x=40;
            return x; //40
        }
    }

    public static int test3(){
        int x = 10;
        try {
            x =20;
            System.out.println(1/0);
            return x; //上一句异常，此句不执行
        } catch (Exception e) {
            x=30;
            return x;
        }finally{
            x=40;
            return x; //覆盖了try、catch中的返回通道，返回40；finally中不要写return；
        }
    }
}



