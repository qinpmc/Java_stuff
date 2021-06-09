package com.qp.common;

import java.util.Scanner;

// Scanner 示例
public class Scanner_demo_3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        //test1(sc);
        //test2(sc);
        //test3(sc);
        //test4(sc);
        test5(sc);
    }

    public static void test1(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a:"+a+",b:"+b);
    }

    public static void test2(Scanner sc){
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("a:"+a+",b:"+b);
    }

    public static void test3(Scanner sc){
        String a = sc.nextLine();
        int b = sc.nextInt();
        System.out.println("a:"+a+",b:"+b);
    }

    // 此时有bug -- 输入的换行符会被认为是 字符串
    public static void test4(Scanner sc){
        int a = sc.nextInt();
        String b = sc.nextLine();
        System.out.println("a:"+a+",b:"+b);
    }

    //解决 test4 的bug
    public static void test5(Scanner sc){
        int a = sc.nextInt();
        Scanner sc2 =  new Scanner(System.in);
        String b = sc2.nextLine();
        System.out.println("a:"+a+",b:"+b);
    }
}
