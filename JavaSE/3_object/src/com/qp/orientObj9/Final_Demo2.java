package com.qp.orientObj9;

public class Final_Demo2 {
    public static void main(String[] args) {
        Dog d =new Dog();
        Animal a = new Animal();

        a.print();  //100 ，父类调用自己的 final print方法，访问的是自身的num1 100
        d.print();  //100，子类调用父类 的final print方法，访问的是父类的num1  100
        d.print2(); //200，子类调用自己 的 print2方法，访问的是自身的num1  200
    }
}

class Animal{
    //父类有 final 成员变量 num1
    final int num1=100;

    public final void print(){
        System.out.println(num1); //100
    }
}
class Dog extends Animal{

    //子类有 final 成员变量 num1
    final int num1=200;

    public final void print2(){
        System.out.println(num1);  //200
    }
/*	public final void print(){  //父类的print方法为final，子类不能重写
		System.out.println(num1);  //200
	}*/

/*	public void print(){  //父类的print方法为final，子类不能重写,子类去掉final也不行
		System.out.println(num1);  //200
	}*/
}

