package com.qp.common3;

import java.util.Calendar;

public class Calendar_demo5 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int date = now.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日"); //2020年2月14日
    }
}
