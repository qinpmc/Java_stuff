package com.qp.orientObj10;

// 内部类中定义了静态成员，该内部类必须为静态的
public class InnerClass_demo3 {

    public static void main(String[] args) {
//        Outer20.Inner30 oi = new Outer20.Inner30();
//        oi.print();
    }

}
class Outer20{

    //The method print cannot be declared static;
    //static methods can only be declared in a
    //static or top level type

/*     class Inner30{  //错误  内部类中定义了静态成员，该内部类必须为静态的
		public static void print(){
			System.out.println(num);
		}
		static int num =100;
    }*/
}

