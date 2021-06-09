package com.qp.orientObj9;

public class polyMorphic_Demo5 {
    public static void main(String[] args) {
        Person p = new Superman(); //向上转型,多态

        System.out.println(p.name);//person，成员变量为父类的

        p.walk(); //super walk
        //p.fly(); //error,编译失败，不能使用子类特用的方法

        Superman sm = (Superman)p;//向下转型
        sm.fly(); //fly... 向下转型后可以使用子类特有方法
        System.out.println(sm.name);// super   向下转型后成员变量为子类的
    }
}

class Person{
    String name="person";
    public void walk(){
        System.out.println("person walk");
    }
}
class Superman extends Person{
    String name = "super";
    public void walk(){
        System.out.println("super walk");
    }
    public void fly(){
        System.out.println("fly...");
    }
}

