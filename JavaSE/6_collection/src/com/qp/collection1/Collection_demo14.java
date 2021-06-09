package com.qp.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList 去重
public class Collection_demo14 {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList();
        list.add(new Animal("zs", 23));
        list.add(new Animal("zs", 23));
        list.add(new Animal("ls", 24));
        list.add(new Animal("ww", 25));
        list.add(new Animal("ls", 24));
        List listNew = getSingle(list);
        System.out.println(listNew); //[Animal [age=23, name=zs], Animal [age=24, name=ls], Animal [age=25, name=ww]]
    }

    public static ArrayList getSingle(ArrayList<Animal> list) {
        ArrayList<Animal> newList = new ArrayList(); // 创建一个新集合
        Iterator<Animal> it = list.iterator(); // 获取迭代器
        while (it.hasNext()) {   // 判断老集合中是否有元素
            Animal temp =  it.next();  // 将每一个元素临时记录住
            if (!newList.contains(temp)) { // 如果新集合中不包含该元素
                newList.add(temp); // 将该元素添加到新集合中
            }
        }
        return newList; // 将新集合返回
    }

}

class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        super();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Animal p = (Animal) obj;
        return p.getName().equals(name) && p.getAge() == age;
    }
}

