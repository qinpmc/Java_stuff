package com.qp.reflect1;

// 获取类对象有3种方式
public class reflect_demo1 {
    public static void main(String[] args) {
        String className = "com.qp.reflect1.Hero";
        try {
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
            System.out.println(pClass1==pClass2);  // true
            System.out.println(pClass1==pClass3); // true
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


//

//获取类对象有3种方式
//        1. Class.forName
//        2. Hero.class
//3. new Hero().getClass()