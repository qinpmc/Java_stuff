package com.qp.orientObj10;

// 外部类静态方法访问内部类时，内部类必须是静态的
public class InnerClass_demo4 {
    public static void main(String[] args) {
        Outer4.print();  //inner static show
    }

}
class Outer4{
    private int num  =100;
    public static void print(){  // 外部类静态方法访问内部类时，内部类必须是静态的
        //new Inner1().show(); //编译失败！！
        new Inner2().show();

    }
    class Inner1{
        public void show(){
            System.out.println("inner show");
        }
    }
    static class Inner2{  // 外部类静态方法访问内部类时，内部类必须是静态的
        public void show(){
            System.out.println("inner static show");
        }
    }
}

