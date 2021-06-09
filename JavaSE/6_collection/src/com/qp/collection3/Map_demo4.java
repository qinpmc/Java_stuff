package com.qp.collection3;

import java.util.Comparator;
import java.util.TreeMap;

// TreeMap
public class Map_demo4 {
    public static void main(String[] args) {
        TreeMap<Man,String> tm= new TreeMap<>();
        tm.put(new Man("zs",23), "shanghai");
        tm.put(new Man("zs",23), "beijing");
        tm.put(new Man("ls",24), "guangzhou");
        tm.put(new Man("ww",25), "shenzhen");
        System.out.println(tm); // {Man [name=ls, age=24]=guangzhou, Man [name=ww, age=25]=shenzhen, Man [name=zs, age=23]=beijing}

        // Comparator 比较器---匿名内部类
        TreeMap<Man,String> tm2= new TreeMap<>(new Comparator<Man>(){  //注意是<Man> ，不是<Man,String>
            @Override
            public int compare(Man p1, Man p2) {
                int num= p1.getName().compareTo(p2.getName());
                return num==0? p1.getAge()-p2.getAge():num;
            }
        });

        tm2.put(new Man("zs",23), "shanghai");
        tm2.put(new Man("zs",23), "beijing");
        tm2.put(new Man("ls",24), "guangzhou");
        tm2.put(new Man("ww",25), "shenzhen");
        System.out.println(tm2); // {Man [name=ls, age=24]=guangzhou, Man [name=ww, age=25]=shenzhen, Man [name=zs, age=23]=beijing}

    }
}
class Man implements Comparable<Man>{
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
        return "Man [name=" + name + ", age=" + age + "]";
    }
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Man p) {
        int num= this.name.compareTo(p.getName());
        return num==0? this.age-p.getAge():num;
    }
}
