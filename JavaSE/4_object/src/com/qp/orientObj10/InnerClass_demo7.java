package com.qp.orientObj10;


// 匿名内部类 -- 匿名类实现接口
public class InnerClass_demo7 {
    public static void main(String[] args) {
        Outer3 out = new Outer3();
        out.method();
    }
}
interface Inter1 {
    void print();
}
class Outer3{
    class Inner3 implements Inter1{  //内部类
        @Override
        public void print() {
            System.out.println("print");
        }
    }
    public void method(){
        //new Inner3().print(); //等同下方匿名内部类
        new Inter1(){  // Inter1 ---接口
            public void print(){ //实现接口方法
                System.out.println("print");
            }
        }.print();;
    }
}

