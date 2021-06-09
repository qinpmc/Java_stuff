package com.qp.common3;

import java.math.BigInteger;

public class BigInteger_demo1 {
    public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("92233720368547758000");
		BigInteger bi2 = new BigInteger("20");

		System.out.println(bi1.add(bi2)); //92233720368547758020
		System.out.println(bi1.subtract(bi2)); //92233720368547757980
		System.out.println(bi1.multiply(bi2)); //
		System.out.println(bi1.divide(bi2)); //

        BigInteger bi3 = new BigInteger("10",16);
        System.out.println(bi3); //16
    }
}
