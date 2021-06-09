package com.qp.reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflect_demo6 {
    public static void main(String[] args) throws Exception {
        Class heroClass = Class.forName("com.qp.reflect2.Hero");

        //获取所有的public 字段
        Field[] publicFields = heroClass.getFields();
        for (int i = 0; i < publicFields.length; i++) {
            System.out.println(publicFields[i].getName()); //name , hp
        }
        System.out.println("------------");

        //获取所有的public 、private字段
        Field[] allFields = heroClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println(field.getName()); //name ,damge ,hp
        }
        System.out.println("------------");

        Hero htest = new Hero("herotest",100,33.f);

        //获取public 字段
        Field nameFiled = heroClass.getField("name");
        String name = (String) nameFiled.get(htest);
        System.out.println(name); //herotest

        //获取所有的字段，public private
        Field damageFiled = heroClass.getDeclaredField("damage");
        damageFiled.setAccessible(true);
        //获取对象字段 值
        int damage = (Integer) damageFiled.get(htest);
        System.out.println(damage); //100

        //设置对象字段 值
        damageFiled.setInt(htest, 200);
        int newdamage = (Integer) damageFiled.get(htest);
        System.out.println(newdamage); //200

        System.out.println("*****************");

        // 获取无参的public构造
        Constructor cons1 = heroClass.getConstructor();
        Hero hero1 = (Hero) cons1.newInstance();
        hero1.setName("hero1");
        System.out.println(hero1.getName()); //hero1
        System.out.println("------------");

        //获取private、带参的构造
        Constructor cons2 = heroClass.getDeclaredConstructor(new Class[] {String.class});
        cons2.setAccessible(true);
        Hero hero2 = (Hero) cons2.newInstance(new Object[] {"hero2"});
        System.out.println(hero2.getName()); //hero2

        Constructor cons2_1 = heroClass.getDeclaredConstructor(String.class);
        cons2.setAccessible(true);
        Hero hero2_1 = (Hero) cons2.newInstance("hero2_1");
        System.out.println(hero2_1.getName()); //hero2_1


        //获取public、带参构造
        Constructor cons3 = heroClass.getConstructor(new Class[] {String.class,int.class,float.class});
        Hero hero3 = (Hero) cons3.newInstance(new Object[] {"heor3",22,33.3f});
        System.out.println(hero3.getName()+" : "+hero3.getHp()); //heor3 : 33.3

        //heroClass.getConstructors(), heroClass.getDeclaredConstructors();

        System.out.println("****************************");

        //Method[] publicmethod1 = heroClass.getMethods();
        //Method[] allmethod = heroClass.getDeclaredMethods();

        Hero htest2 = new Hero("herotest2",1000,33.3f);
        // 获取public 方法 say,say方法无参
        Method say = heroClass.getMethod("say");
        say.invoke(htest2); //I am a hero


        // 获取private 方法 speak
        Method speak = heroClass.getDeclaredMethod("speak", String.class);
        speak.setAccessible(true);
        //speak方法 参数为String ---传入haha
        speak.invoke(htest2, "haha"); //I am haha

    }

}
