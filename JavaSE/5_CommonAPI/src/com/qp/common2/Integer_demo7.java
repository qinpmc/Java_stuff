package com.qp.common2;

public class Integer_demo7 {
    public static void main(String[] args) {
        // int -- string
        int i = 100;

        String s = ""+i;
        String s2 = String.valueOf(i);
        String s3 = new Integer(i).toString();
        String s4 = Integer.toString(i);

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        String ss = "200";
        int ii = new Integer(ss).intValue();
        int ii2 = Integer.parseInt(ss);
        System.out.println(ii);
        System.out.println(ii2);
    }
}
