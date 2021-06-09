package com.qp.common2;

public class Reg_demo10 {
    public static void main(String[] args) {

        String s1 = "ad-ed-df";
        String[] res1 = s1.split("-");
        for(int i=0;i<res1.length;i++){
            System.out.println(res1[i]);
        }

        System.out.println("*************");

        String s2 = "ad.ed.df";
        String[] res2 = s2.split("\\.");
        for(int i=0;i<res2.length;i++){
            System.out.println(res2[i]);
        }

        System.out.println("*************");

        String s3 = "ad   ed    df";
        String[] res3 = s3.split(" +");
        for(int i=0;i<res3.length;i++){
            System.out.println(res3[i]);
        }

        System.out.println("*************");

        String s4 = "F:\\notes\\java";
        String[] res4 = s4.split("\\\\");
        for(int i=0;i<res4.length;i++){
            System.out.println(res4[i]);
        }
    }
}
