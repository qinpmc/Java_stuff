package com.qp.reflect1;

import java.lang.reflect.Constructor;

//反射创建对象
public class reflect_demo2 {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1(){
        //传统的使用new的方式创建对象
        Hero h1 =new Hero();
        h1.setName("teemo");
        System.out.println(h1.getName());
    }

    private static void test2(){
        try {
            //使用反射的方式创建对象
            String className = "com.qp.reflect1.Hero";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor();
            //通过构造器实例化
            Hero h2= (Hero) c.newInstance();
            h2.setName("gareen");
            System.out.println(h2.getName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
