package com.qp.collection2;

import java.util.Set;
import java.util.TreeSet;

// TreeSet—自然排序
public class TreeSet_demo5 {
    public static void main(String[] args) {
        Set<HumanBeing> set = new TreeSet<HumanBeing>();
        set.add(new HumanBeing("zs",23));
        set.add(new HumanBeing("aq",24));
        set.add(new HumanBeing("ca",25));
        set.add(new HumanBeing("ca",26));
        set.add(new HumanBeing("ca",26));  // 重复实例，不重复添加
        System.out.println(set); // [Person [name=aq, age=24], Person [name=ca, age=25], Person [name=ca, age=26], Person [name=zs, age=23]]
    }

}
class HumanBeing implements Comparable<HumanBeing>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public HumanBeing(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(HumanBeing p) {
        int num =name.compareTo(p.getName());
        System.out.println(num);
        return num == 0? age - p.getAge():num;
        //return num;  //只比较name，name相同则认为是重复元素（即使age不同）
    }
}

