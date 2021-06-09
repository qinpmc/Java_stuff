package com.qp.orientObj9;

public class Final_Demo1 {
    public static void main(String[] args) {
        final double PI;
        PI = 3.14;
        System.out.println(PI); //3.14
        method(10); //10 ,
        method(20); //20 ,注意此处并非将上一步的 final x修改为20

    }
    public static void method(final int x){
        System.out.println(x);
    }
}
class Demo1{
    final int NUM = 1;
    final int NUM2; //必须在构造函数中或代码块中初始化，否则出错！

    public Demo1(){
        //构造函数中初始化可以
        //NUM2 = 2;
    }

    //代码块中初始化也行
    {
        NUM2 = 2;
    }

    public void print(){
        //NUM = 2; //final修饰的变量不可修改
        System.out.println(NUM);
    }
}