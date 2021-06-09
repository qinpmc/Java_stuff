package com.qp.common3;

import java.util.Calendar;

public class Calendar_demo7 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 21);
        System.out.println(cal.get(Calendar.DATE)); //21

        // 创建一个 Calendar 用于比较时间
        Calendar calendarNew = Calendar.getInstance();

        // 设定为 5 小时以前，后者大，显示 -1
        calendarNew.add(Calendar.HOUR, -5);
        System.out.println("时间比较：" + calendarNew.compareTo(cal));

        System.out.println(cal.getTimeInMillis());
    }
}
