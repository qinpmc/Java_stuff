package com.qp.generic;

import java.util.ArrayList;
import java.util.List;

//? super
public class Generic_demo6_3 {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        //tes_wrong(dogs); //  编译失败，必须传入Animal 及其父类

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        test(animals);
        System.out.println(animals); // [Animal, Dog, Cat, Dog]

        tes_wrong(animals); //  Animal Dog Cat Dog
    }

    public static void tes_wrong(List<? super Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            // Animal animal = animals.get(i); // 编译失败，不能获取
            Object objAnimal = animals.get(i); // 可以以Object接收
            System.out.println(objAnimal);

        }
    }

    public static void test(List<? super Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            if(i==0) animals.add(new Cat()); //  可以添加Animal以及Animal的子类
            if(i==1) animals.add(new Dog());// 可以添加Animal以及Animal的子类
        }
    }
}
