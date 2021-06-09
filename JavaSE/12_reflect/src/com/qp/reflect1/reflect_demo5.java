package com.qp.reflect1;

import java.lang.reflect.Method;

public class reflect_demo5 {
    public static void main(String[] args) {
        test1();
        System.out.println("_______________________");
        test2();
    }

    public static void test1(){
        Hero h = new Hero();
        h.call(new Hero()); //call Hero
        h.call(new APHero()); // call APHero
    }

    public static void test2(){
        Hero h = new Hero();
        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method m = h.getClass().getMethod("call", Hero.class);
            // 对h对象，调用这个方法
            m.invoke(h, new Hero()); //call Hero

            Method m2 = h.getClass().getMethod("call", APHero.class);
            // 对h对象，调用这个方法
            m2.invoke(h, new APHero()); //call APHero

            Method m3 = h.getClass().getMethod("call", String.class);
            // 对h对象，调用这个方法
            Hero hero = new APHero();
            hero.setName("killer");
            m3.invoke(h, hero.getName()); //call killer

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
