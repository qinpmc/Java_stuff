package com.qp.orientObj10;

public class InnerClass_demo1 {

    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner(); //内部类实例化
        oi.print1(); //100

        Outer out1= new Outer();
        Outer.Inner oi1 = out1.new Inner();// 另一种 内部类实例化
        oi1.print1(); //100

        Outer o = new Outer();
        o.print1();  //100

        //静态内部类
        Outer.Inner3 ois = new Outer.Inner3(); //静态内部类
        ois.method(); //method     ----调用静态内部类 非静态方法
        Outer.Inner3.m2(); //m2     ----调用静态内部类 静态方法

        //Outer.Inner2 oi2 = new Outer().new Inner2(); //私有内部类，外部不可见（只有内部类才可为private）
        //The type Outer.Inner2 is not visible
    }

}

class Outer {
    private int num = 100;

    class Inner {  // 内部类
        public void print1() {
            System.out.println(num); //内部类访问外部类私有成员
        }
    }

    private class Inner2 { //私有的内部类
        public void print2() {
            System.out.println(num);
        }
    }

    public void print1() {
        Inner2 i2 = new Inner2();
        i2.print2();
    }

    static class Inner3 { //静态的内部类
        public void method() {
            System.out.println("method");
        }

        public static void m2() {
            System.out.println("m2");
        }
    }
}

