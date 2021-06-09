package com.qp.common;

public class String_demo_8 {
    public static void main(String[] args) {
        //查询字符串中字符出现的次数
        String max = "woaiheima,heimabutong,suliheimasdfs,zhaoxiaolaf";
        String min = "heima";
        int count = 0;
        int index = 0;
        while(max.indexOf(min,index)!=-1){
            count++;
            index = max.indexOf(min,index)+1;
        }
        System.out.println(count); // 3
    }
}
