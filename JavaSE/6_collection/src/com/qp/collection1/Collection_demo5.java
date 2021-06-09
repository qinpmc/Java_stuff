package com.qp.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List 的特有方法
public class Collection_demo5 {
    public static void main(String[] args) {
        // test1();
        // test2();
        test3();

    }

    public static void test1(){
        List<Pig> list1 = new ArrayList<>();
        Pig pig1 = new Pig(9);
        list1.add(pig1);
        list1.add(new Pig(3));
        list1.add(new Pig(4));
        list1.add(pig1); //List 重复添加

        print(list1); //  pig:9   pig:3  pig:4  pig:9
    }


    public static void test2(){
        List<Pig> list1 = new ArrayList<>();
        Pig pig1 = new Pig(9);
        list1.add(0,pig1); // 此时 index 改 为0以外的均报错，因为此时list尚为空
        list1.add(1,new Pig(3)); // index 不能大于list的长度+1 ，此处可取0，1
        list1.add(1,new Pig(4)); // index 不能大于list的长度+1 ，此处可取0，1，2
        list1.add(pig1); //List 重复添加

        print(list1); //  pig:9  pig:4  pig:3   pig:9
    }

    public static void test3(){
        List<Pig> list1 = new ArrayList<>();
        Pig pig1 = new Pig(9);
        list1.add(0,pig1); // 此时 index 改 为0以外的均报错，因为此时list尚为空
        list1.add(1,new Pig(3)); // index 不能大于list的长度+1 ，此处可取0，1
        list1.add(2,new Pig(4)); // index 不能大于list的长度+1 ，此处可取0，1，2

        // System.out.println(list1.get(3)); // 报错
        // System.out.println(list1.remove(3)); // 报错

        System.out.println(list1.get(2)); // 正确
        System.out.println(list1.remove(2));// 正确
    }

    public static void print(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class Pig{
    int  age;
    public Pig(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "pig:"+age;
    }
}