package com.qp.orientObj9;

//重名的成员变量
public class Interface_Demo12_2 {
    public static void main(String[] args) {
        AAi1 aa1 = new AAi1();
        System.out.println(aa1.num); //200
    }
}

interface Inf1{
    int num =100;
}

// 覆盖 Inf1 的num
interface Inf2 extends Inf1{
    int num =200;
}

class AAi1 implements Inf2{

}
