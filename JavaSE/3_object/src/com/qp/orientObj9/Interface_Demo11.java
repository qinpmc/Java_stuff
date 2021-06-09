package com.qp.orientObj9;


// 多个接口方法同名 示例
public class Interface_Demo11 {
    public static void main(String[] args) {
        Impl1 impl1 = new Impl1();
        impl1.print11();
        impl1.say12();
    }

}
interface Inter11 {

    void print11();

    double getPrice(double base);
}
interface Inter12 extends Inter11 {

    void print11(); //与接口 Inter11的 print11 方法同名，返回值一致

    int getPrice(); //与接口 Inter11的 getPrice 方法同名，输入参数不同，方法重载

    void say12();
}

class Impl1 implements Inter12{

    public void print11() {
        System.out.println("print11");
    }
    public void say12() {
        System.out.println("say12");
    }

    public double getPrice(double base){
        return base+12.0;
    }

    public int getPrice(){
        return 12;
    }
}

interface Inter201 {
    void print201();
}

interface Inter202 {
    int print201();
}

/*
class Impl2 implements Inter201,Inter202{
    public void print201(){  //编译失败，两个接口的方法同名，但返回值不一致

    }
}*/
