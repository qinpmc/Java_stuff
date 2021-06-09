package com.qp.orientObj10;


//  对外部类 的成员变量的 引用
public class InnerClass_demo5 {
    public static void main(String[] args) {
        Outer22.Inner2 oi2 = new Outer22().new Inner2();
        oi2.print();
    }

}
class Outer22{

    private int num =3;
    class Inner2{
        int num = 4;
        public void print(){
            int num = 5;
            System.out.println(num);       //5
            System.out.println(this.num);   //4
            System.out.println(Outer22.this.num); //3  -- Outer2.this 对外部类Outer2 的引用
        }
    }
}
