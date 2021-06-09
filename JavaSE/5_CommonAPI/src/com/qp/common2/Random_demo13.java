package com.qp.common2;

import java.util.Random;

public class Random_demo13 {
    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        test4();
    }

    public static void test1(){
        Random r= new Random();
        for (int i = 0; i <10; i++) {
            int x = r.nextInt();    //产生int取值范围之间的随机数
            System.out.println(x);
        }
    }

    public static void test2(){
        Random r= new Random();
        for (int i = 0; i <10; i++) {
            int y = r.nextInt(10);  //产生0~10之间的随机数
            System.out.println(y);
        }
    }

    public static void test3(){
        Random r= new Random(100);
        for (int i = 0; i <10; i++) {
            int x = r.nextInt(10);  //产生0~10之间的随机数,有种子数，每次产生同样的随机数
            System.out.println(x);
        }
    }

    public static void test4(){
        Random r= new Random(100);
        for (int i = 0; i <10; i++) {
            int x = r.nextInt();  // 产生int范围 的随机数,有种子数，每次产生同样的随机数
            System.out.println(x);
        }
    }
}
