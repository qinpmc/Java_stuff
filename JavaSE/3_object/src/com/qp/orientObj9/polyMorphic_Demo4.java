package com.qp.orientObj9;

public class polyMorphic_Demo4 {
    public static void main(String[] args) {
        Father2 father = new Son2();

        //成员变量：子类和父类均有
        System.out.println(father.num); //100 ，父类的num：100，并非子类的num：1000

        // 编译报错 ，成员变量 ：左边的父类没有 num2
        //System.out.println(father.num2);

        // 成员方法：子类和父类均有
        father.show(); //show son ,子类的show方法

        // 编译报错 ，成员方法：左边的父类没有 say
        //father.say(); //show son


        // 静态成员方法：子类和父类均有,
        father.print(); //print Father  父类的静态 print方法

        //编译报错 ,静态成员方法：左边的父类没有 speak
        //father.speak();
    }
}

class Father2{
    int num = 100;

    public void show(){
        System.out.println("show Father");
    }

    public static void print(){
        System.out.println("print Father");
    }
}



class Son2 extends Father2{
    int num = 1000;
    int num2 = 2000;

    public void show(){
        System.out.println("show Son");
    }

    public void say(){
        System.out.println("say Son");
    }

    public static void print(){
        System.out.println("print Son");
    }

    public static void speak(){
        System.out.println("speak Son");
    }
}