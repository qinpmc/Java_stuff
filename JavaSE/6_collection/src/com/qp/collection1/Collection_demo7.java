package com.qp.collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// ListIterator 特有方法
public class Collection_demo7 {
    public static void main(String[] args) {
        test1();
        // testWrong();
    }

    public static void test1(){
        List<Boy> list1 = new ArrayList<>();
        list1.add(0,new Boy(9));
        list1.add(1,new Boy(4));
        list1.add(2,new Boy(6));

        ListIterator iterator = list1.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()); // Girl:9   Girl:4   Girl:6
        }
        System.out.println("*********************");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous()); // // Girl:6   Girl:4  Girl:9
        }
    }

    public static void testWrong(){
        List<String> l1 = new ArrayList<String>();
        l1.add("qq1");
        l1.add("qq2");
        l1.add("qq3");

        ListIterator<String> li1 = l1.listIterator();
        while(li1.hasNext()){
            if(li1.next().equals("qq2")){
                System.out.println(li1.previous()); // 死循环
            }
        }

    }
}

class Boy{
    int  age;
    public Boy(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "Boy:"+age;
    }
}