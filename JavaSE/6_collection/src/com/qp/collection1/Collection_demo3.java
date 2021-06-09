package com.qp.collection1;

import java.util.ArrayList;
import java.util.Collection;

// Collection remnove 不存在的对象
public class Collection_demo3 {
    public static void main(String[] args) {
        Collection<Cat> c1 = new ArrayList<>();
        Cat cat1 = new Cat(1);
        Cat cat2 = new Cat(2);
        Cat cat3 = new Cat(3);

        c1.add(cat1);
        c1.add(cat2);
        c1.add(cat3);

        boolean bool = c1.remove(new Cat(1)); // 移除一个c1中不存在的对象，返回false
        System.out.println(c1); //[cat：1, cat：2, cat：3]
        System.out.println(bool); //false
    }
}

class Cat{
    private int age;
    public Cat(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "cat："+this.age;
    }
}