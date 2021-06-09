package com.qp.generic;

import java.util.ArrayList;
import java.util.List;

// ? extends Animal
public class Generic_demo6_2 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        test(cats); // 喵喵 喵喵
        test(dogs); // 旺旺 旺旺

    }

    public static void test(List<? extends Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).say();
        }
    }

    public static void tes_wrong(List<? extends Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            // if(i==0) animals.add(new Cat()); // 编译失败，不能添加
            // if(i==1) animals.add(new Dog());// 编译失败，不能添加
            Animal animal = animals.get(i); // 可以取出，但只能以Animal 接收
            animal.say();
        }
    }
}

//动物类
class Animal {
    public  void say(){
        System.out.println("动物叫");
    };
    public String toString(){
        return "Animal";
    }
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("喵喵");
    }
    public String toString(){
        return "Cat";
    }
}

class Dog extends Animal {

    @Override
    public void say() {
        System.out.println("旺旺");
    }
    public String toString(){
        return "Dog";
    }
}