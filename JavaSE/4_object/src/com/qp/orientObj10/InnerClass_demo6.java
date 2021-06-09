package com.qp.orientObj10;


// 局部内部类访问局部变量必须用final修饰
public class InnerClass_demo6 {
    public static void main(String[] args) {
        Outer24 out = new Outer24();
        out.method(2000); // 1000 2000

    }

}
class Outer24{
    public void method(final int n){
        final int num = 1000;
        class Inner{  //局部内部类
            public void print(){
                System.out.println(num);
                System.out.println(n);
            }
        }
        Inner i = new Inner();
        i.print();
    }
}


