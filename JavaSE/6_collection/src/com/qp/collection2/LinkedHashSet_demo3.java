package com.qp.collection2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// LinkedHashSet
public class LinkedHashSet_demo3 {
    public static void main(String[] args) {
        test1();
        test2();
    }
    // HashSet
    public static void test1(){
        Set<Person> set = new HashSet<>();
        set.add(new Person("qq1",21));
        set.add(new Person("qq1",21));//无法加入，Person重写hashcode和equals方法
        set.add(new Person("aq2",22));
        set.add(new Person("qq3",23));
        set.add(new Person("cq4",24));
        set.add(new Person("qq5",25));
        System.out.println(set); //不保证存入顺序
        // [Person [name=qq1, age=21], Person [name=qq3, age=23], Person [name=qq5, age=25], Person [name=aq2, age=22], Person [name=cq4, age=24]]
    }

    // LinkedHashSet
    public static void test2(){
        LinkedHashSet<Person> lhs = new LinkedHashSet<>();
        lhs.add(new Person("qq1",21));
        lhs.add(new Person("qq1",21));//无法加入，Person重写hashcode和equals方法
        lhs.add(new Person("aq2",22));
        lhs.add(new Person("qq3",23));
        lhs.add(new Person("cq4",24));
        lhs.add(new Person("qq5",25));
        System.out.println(lhs); //保证存入顺序
       //[Person [name=qq1, age=21], Person [name=aq2, age=22], Person [name=qq3, age=23], Person [name=cq4, age=24], Person [name=qq5, age=25]]
    }
}
