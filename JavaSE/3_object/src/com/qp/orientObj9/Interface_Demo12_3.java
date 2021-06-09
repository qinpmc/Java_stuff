package com.qp.orientObj9;

public class Interface_Demo12_3 {
    public static void main(String[] args) {
        AAa1 aaa1 = new AAa1();
        System.out.println(aaa1.num); //运行错误，field aa1.num is ambiguous
    }
}

interface Interf1{
    int num =100;
}

interface Interf2 extends Interf1{
    int num =200;
}

class AAa1 implements Interf2,Interf1{

}

