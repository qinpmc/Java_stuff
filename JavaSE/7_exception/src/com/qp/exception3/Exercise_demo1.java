package com.qp.exception3;

public class Exercise_demo1 {
    public static void main(String[] args) {
        int i = Test1();
        System.out.println(i); //我有用！  我也有用！    101
        int i2 = Test2();
        System.out.println(i2); //  除数不能为0！ finally   100
    }

    public static int Test1(){
        int x = 100;
        try
        {
            x++;    //x=100+1 --->101
            System.out.println("我有用！");
            return x;   //建立返回通道,x=101
        }
        catch (Exception e) {
            System.out.println("我没用！");
        }
        finally
        {
            ++x;  //此句代码执行了，x=101+1 --->102
            System.out.println("我也有用！"); // 此句代码也执行
        }
        return 2;
    }

    public static int Test2(){
        int x = 200;
        try
        {
            int num=x / 0; //制造异常
            System.out.println(num);
        }
        catch (ArithmeticException e) {
            System.err.println("除数不能为0！");
            return 100;
        }
        finally
        {
            ++x; // ++200 ---->201
            System.out.println("finally");
        }
        return 2;
    }
}

