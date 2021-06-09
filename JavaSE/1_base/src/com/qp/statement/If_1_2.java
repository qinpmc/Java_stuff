package com.qp.statement;

public class If_1_2 {
    public static void main(String[] args) {
        int n = 1;
        {
            int k = 2;
            //int n = 3; 编译报错
        }
    }

    public static void test(){
        int n = 1;
        {
            int k = 2;
            //int n = 3; // 编译报错
        }
    }
}
