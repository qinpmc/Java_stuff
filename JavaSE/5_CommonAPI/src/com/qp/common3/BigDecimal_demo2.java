package com.qp.common3;

import java.math.BigDecimal;

public class BigDecimal_demo2 {
    public static void main(String[] args) {
        System.out.println(2.0-1.1); //0.8999,丢失精度 --直接用float double 容易丢失精度

        BigDecimal bd1 = new BigDecimal(2.0);
        BigDecimal bd2 = new BigDecimal(1.1);
        System.out.println(bd1.subtract(bd2)); //0.8999 ,丢失精度

        BigDecimal bd3 = new BigDecimal("2.0");
        BigDecimal bd4 = new BigDecimal("1.1");
        System.out.println(bd3.subtract(bd4)); //0.9  不丢失精度


        BigDecimal bd5 = BigDecimal.valueOf(2.0);
        BigDecimal bd6 = BigDecimal.valueOf(1.1);
        System.out.println(bd5.subtract(bd6)); //0.9  不丢失精度

    }
}
