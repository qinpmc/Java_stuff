package com.qp.test1;

public class Interface_dem01 {
    public static void main(String[] args) {
        MyTest my1 = new MyTest();
        my1.print();// 接口中带方法体的非静态方法

        //my1.show(); //编译错误
        Inter1.show(); // 接口中带方法体的静态方法
    }
}
interface Inter1{
    public default void print(){
        System.out.println("接口中带方法体的非静态方法");
    }
    public static void show(){
        System.out.println("接口中带方法体的静态方法");
    }
}
class MyTest implements Inter1{

}

