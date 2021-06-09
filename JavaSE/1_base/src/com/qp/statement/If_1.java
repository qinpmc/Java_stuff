package com.qp.statement;

public class If_1 {
    public static void main(String[] args) {
        //  只会选择一个条件语句执行
        int num =11;
        if(num>10){
            System.out.println("num>10"); // num>10
        }else if(num>0){
            System.out.println("num正数");
        }else{
            System.out.println("其他");
        }


    }
}
