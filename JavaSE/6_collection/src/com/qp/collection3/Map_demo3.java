package com.qp.collection3;

import java.util.HashMap;
import java.util.LinkedHashMap;

// LinkedHashMap 保证遍历时，取出的内容顺序和存入时一致
public class Map_demo3 {
    public static void main(String[] args) {
        testLinkedHashMap();
        testHashMap();
    }

    // LinkedHashMap 保证遍历时，取出的内容顺序和存入时一致
    public static void testLinkedHashMap(){
        LinkedHashMap<Person,String> lhm = new LinkedHashMap<>();
        lhm.put(new Person("zs",23), "shanghai");
        lhm.put(new Person("zs",23), "beijing");
        lhm.put(new Person("ls",24), "guangzhou");
        lhm.put(new Person("ww",25), "shenzhen");
        System.out.println(lhm); // {Person [age=23, name=zs]=beijing, Person [age=24, name=ls]=guangzhou, Person [age=25, name=ww]=shenzhen}
    }

    public static void testHashMap(){
        HashMap<Person,String> hm= new HashMap<>();
        hm.put(new Person("zs",23), "shanghai");
        hm.put(new Person("zs",23), "beijing"); // 替换上一行插入的值
        hm.put(new Person("ls",24), "guangzhou");
        hm.put(new Person("ww",25), "shenzhen");
        System.out.println(hm); // {Person [age=23, name=zs]=beijing, Person [age=25, name=ww]=shenzhen, Person [age=24, name=ls]=guangzhou}
    }
}
