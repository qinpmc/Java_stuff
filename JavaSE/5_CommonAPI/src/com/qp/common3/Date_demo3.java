package com.qp.common3;
import java.util.Date;

public class Date_demo3 {
    public static void main(String[] args) {
        Date d = new Date();
        long timeSeconds = d.getTime();

        System.out.println(timeSeconds);
        System.out.println(System.currentTimeMillis()); //毫秒数同上

        Date d2 = new Date();
        d2.setTime(100*3600);
        System.out.println(d2); //Thu Jan 01 08:06:00 CST 1970
    }
}
