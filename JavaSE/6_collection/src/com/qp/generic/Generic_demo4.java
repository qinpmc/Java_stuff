package com.qp.generic;

// 泛型类，属性、方法均没使用T，可行的语法
public class Generic_demo4 {
    public static void main(String[] args) {
        Gener1<String> gener1 = new Gener1<>(12);
        System.out.println(gener1.getAge());
    }
}


class Gener1 <T>{  //泛型类，属性、方法均没使用T，可行的语法
    private int age;
    public Gener1(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}





