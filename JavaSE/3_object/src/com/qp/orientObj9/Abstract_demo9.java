package com.qp.orientObj9;

public class Abstract_demo9 {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.say(); // Boy say...
        boy.breath(); // Boy breath...
        System.out.println(boy.age); //3

        Daughter daughter = new Daughter();
        daughter.breath(); // breath..
        daughter.clean(); //Daughter clean...
        daughter.cook();  //Daughter cook...
        System.out.println(daughter.age); // 1


    }
}

interface AbstrInterface{
    void breath();
}

abstract class Grama1{ //
    int age = 1;           //抽象类可以有非抽象的成员变量
   // abstract String name; //没有抽象成员变量
    abstract void clean();
}

abstract class Grama2{ // 抽象类可以没有抽象方法
    int age = 2;
}

class Grapa3{ // 实体类
    int age = 3;
}

abstract class Mom extends Grama1 implements AbstrInterface{
    // 抽象类也可实现接口 -- AbstrInterface，继承抽象类 -- Grapa1
    abstract void cook(); //子类扩展抽象父类，该类也是抽象类
    public void breath() {
        System.out.println(" breath..");
    }
}

abstract class Papa extends Grapa3 implements AbstrInterface{
    // 抽象类也可实现接口--AbstrInterface，还可继承实体类 -- Grapa3
    abstract void say(); //子类扩展抽象父类，该类也是抽象类

}

class Boy extends Papa{

    @Override
    public void breath() {
        System.out.println("Boy breath...");
    }

    @Override
    void say() {
        System.out.println("Boy say...");
    }
}

class Daughter extends Mom{

    @Override
    public void cook(){
        System.out.println("Daughter cook...");
    }

    @Override
    public void clean(){
        System.out.println("Daughter clean...");
    }
}

