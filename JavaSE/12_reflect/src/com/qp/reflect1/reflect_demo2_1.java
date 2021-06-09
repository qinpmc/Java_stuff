package com.qp.reflect1;

import java.lang.reflect.Constructor;

//反射创建对象
public class reflect_demo2_1 {
    public static void main(String[] args) {
        test1();
    }


    private static void test1(){
        try {
            //使用反射的方式创建对象
            String className = "com.qp.reflect1.Person";
            //类对象
            Class pClass=Class.forName(className);
            //构造器
            Constructor c= pClass.getConstructor(int.class,String.class);
            //通过构造器实例化
            Person p= (Person) c.newInstance(22,"qq");
            System.out.println(p);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
