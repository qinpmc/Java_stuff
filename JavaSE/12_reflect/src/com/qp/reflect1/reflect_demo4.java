package com.qp.reflect1;

import java.lang.reflect.Field;

public class reflect_demo4 {
    public static void main(String[] args) throws InterruptedException {
        Hero h =new Hero();
        //使用传统方式修改name的值为garen
        h.name = "garen";
        h.setDamage(99);

        test1(h);
        test2(h);

    }

    public static void test1(Hero h){
        try {
            //获取类Hero的名字叫做name的字段
            //Field f1= h.getClass().getDeclaredField("name"); // 可行

            Field f1= h.getClass().getField("name"); // 可行
            //修改这个字段的值
            f1.set(h, "teemo");
            //打印被修改后的值
            System.out.println(h.name); // teemo

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void test2(Hero h){
        try {
            //获取类Hero的名字叫做name的字段
            Field f1= h.getClass().getDeclaredField("damage");
            f1.setAccessible(true);
            //修改这个字段的值
            f1.set(h, 199);
            //打印被修改后的值
            System.out.println(h.getDamage()); // 199

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

//getField 只能获取public的，包括从父类继承来的字段。
//getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。
//(注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))