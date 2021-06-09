package com.qp.orientObj9;

// 多态-- 成员变量 ：编译看左边，运行看左边
public class polyMorphic_Demo3 {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.num); //100 ，并非子类的1000

        // 编译报错
        //System.out.println(father.num2);
    }
}

class Father{
    int num = 100;
    public void show(){
        System.out.println("show Father");
    }
}

class Son extends Father{
    int num = 1000;
    int num2 = 2000;

    public void show(){
        System.out.println("show Son");
    }
}