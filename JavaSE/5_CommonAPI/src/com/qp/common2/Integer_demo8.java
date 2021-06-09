package com.qp.common2;

public class Integer_demo8 {
    public static void main(String[] args) {
        Integer i1 = new Integer(97); //public final class Integer extends Number implements Comparable<Integer> {
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);      //false
        System.out.println(i1.equals(i2)); //true
        System.out.println("-----------");

        Integer i3 = new Integer(197);
        Integer i4 = new Integer(197);
        System.out.println(i3 == i4); //false
        System.out.println(i3.equals(i4)); //true
        System.out.println("-----------");

        Integer i5 = 97;
        Integer i6 = 97;
        System.out.println(i5 == i6);      //true ，-128 ~127的byte取值范围，自动装箱不创建新对象，而是从常量池IntegerCache中获取
        System.out.println(i5.equals(i6)); //true
        System.out.println("-----------");

        Integer i7 = 197;
        Integer i8 = 197;
        System.out.println(i7 == i8);      //false
        System.out.println(i7.equals(i8)); //true

/*        public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);
        }*/


    }

}
