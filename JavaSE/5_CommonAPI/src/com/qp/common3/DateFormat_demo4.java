package com.qp.common3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_demo4 {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String date = sdf.format(d);
        System.out.println(date); //2020年02月14日21:21:57

        String dateStr = dateToString(new Date(),"yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println(dateStr); //2020-02-14 21:40:06:029


    }

    public static String dateToString(Date date,String format){
        return (new SimpleDateFormat(format)).format(date);
    }

    public static Date stringToDate(String dateStr,String format) throws ParseException {
        return  new SimpleDateFormat(format).parse(dateStr);
    }
}
