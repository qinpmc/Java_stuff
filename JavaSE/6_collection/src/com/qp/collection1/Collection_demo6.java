package com.qp.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// List的遍历
public class Collection_demo6 {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }
    public static void test1(){
        List<Girl> list1 = new ArrayList<>();
        list1.add(0,new Girl(9));
        list1.add(1,new Girl(3));
        list1.add(2,new Girl(4));

        //list的第一种遍历
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i)); // Girl:9   Girl:3   Girl:4
        }
    }

    public static void test2(){
        List<Girl> list1 = new ArrayList<>();
        list1.add(0,new Girl(9));
        list1.add(1,new Girl(4));
        list1.add(2,new Girl(5));

        Iterator iterator = list1.iterator();
        //list的第二种遍历
        while (iterator.hasNext()){
            System.out.println(iterator.next()); // Girl:9   Girl:4   Girl:5
        }
    }

    public static void test3(){
        List<Girl> list1 = new ArrayList<>();
        list1.add(0,new Girl(9));
        list1.add(1,new Girl(4));
        list1.add(2,new Girl(6));

        ListIterator iterator = list1.listIterator();
        //list的第三种遍历
        while (iterator.hasNext()){
            System.out.println(iterator.next()); // Girl:9   Girl:4   Girl:6
        }
    }

}

class Girl{
    int  age;
    public Girl(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Girl:"+age;
    }
}