package com.qp.orientObj9;

// 重名的成员变量
public class Interface_Demo12 {
    public static void main(String[] args) {
        AA1 aa1 = new AA1();
        System.out.println(aa1.num); //300

    }
}

interface If1{
    int num =100;
}

interface If2{
    int num =200;
}

class AA1 implements If2,If1{
    int num =300;
}
