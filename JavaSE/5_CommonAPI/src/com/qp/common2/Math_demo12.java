package com.qp.common2;

public class Math_demo12 {
    public static void main(String[] args) {
        System.out.println(getRandom(10,13));
    }

    public static int getRandom(int start ,int end){
        int num = (int) (Math.random()*(end - start +1))+start;
        return  num;
    }
}
