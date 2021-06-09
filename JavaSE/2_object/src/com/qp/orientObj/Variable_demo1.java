package com.qp.orientObj;


//成员变量和局部变量 示例
public class Variable_demo1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.Say();  // null  0  false
        System.out.printf("_________________");
        fun(); // -99
    }

    public static void fun(){
        //int age ;  // 不赋值直接编译失败
        int age = -99;
        System.out.println(age);
    }
}

class Person{
    private String name; // 默认 null
    private int age;  //默认 0
    private boolean hasId; // 默认false

    public void Say(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(hasId);
    }
}