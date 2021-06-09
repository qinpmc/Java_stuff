package com.qp.orientObj2;

// 代码块执行顺序 示例
public class Constructor_demo1 extends Person
{

    Person p = new Person();

    //构造函数
    Constructor_demo1(){
        System.out.println("Constructor_demo1 constructor");
    }

    public static void main(String[] args) {
        Constructor_demo1 demo1 = new Constructor_demo1();
    }

    {
        System.out.println("Constructor_demo1 constructor block");
    }
}


class Person{
    Car car = new Car();

    Person(){
        System.out.println("Person constructor");
    }

    {
        System.out.println("Person constructor block");
    }
}

class Car{

    private int price = 20;

    Car(){
        System.out.println(price);
        System.out.println("Car constructor");
    }
    {
        System.out.println(price);
        System.out.println("Car constructor block");
    }
}
