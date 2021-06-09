package com.qp.enum1;

public class Enum_demo4 {
    public static void main(String[] args) {
        test1();
        System.out.println("***************");
        test2();
        System.out.println("***************");
        test3();
    }

    //values
    private static void test1(){
        Color[] colors = Color.values();
        for (Color c:colors) {
            System.out.println(c); //RED GREEN BLUE
        }
    }

    private static void test2(){
        Color c1 = Color.BLUE;
        System.out.println(c1.name()); // BLUE
        System.out.println(c1.ordinal()); // 2
        System.out.println(c1.equals(Color.BLUE)); // true
        System.out.println(c1.compareTo(Color.GREEN)); // 1
    }

    private static void test3(){
        Color c2 = Enum.valueOf(Color.class, "GREEN");
        System.out.println(c2.name()); // GREEN
    }
}
