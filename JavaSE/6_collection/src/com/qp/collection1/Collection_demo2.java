package com.qp.collection1;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("aa1");
        c1.add("aa2");
        c1.add("aa3");
        c1.add("aa4");

        Collection c2 = new ArrayList();

        c2.add("aa4");
        c2.add("aa5");
        c2.add("aa6");

        //test1(c1,c2);
        //test2(c1,c2);
        //test3(c1,c2);
        test4(c1,c2);
    }

    public static void test1(Collection c1,Collection c2){
        c1.addAll(c2);
        System.out.println(c1); //[aa1, aa2, aa3, aa4, aa4, aa5, aa6]
    }

    public static void test2(Collection c1,Collection c2){
        c1.removeAll(c2);
        System.out.println(c1); //[aa1, aa2, aa3]
    }

    public static void test3(Collection c1,Collection c2){
        boolean res = c1.containsAll(c2);
        System.out.println(res); // false
    }
    public static void test4(Collection c1,Collection c2){
        boolean res = c1.retainAll(c2); // c1 对c2 作交集，取交集结果存入c1,c2不变，返回值表示c1是否改变
        System.out.println(res); // true
        System.out.println(c1); //[aa4]， c1 ,c2交集为aa4
        System.out.println(c2); //[aa4, aa5, aa6]  c2不变
    }
}
