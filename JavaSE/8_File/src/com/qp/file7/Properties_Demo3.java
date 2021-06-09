package com.qp.file7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Properties_Demo3 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    private static void test1() throws IOException {
        Properties p = new Properties();
        p.setProperty("username", "zs");
        p.setProperty("age", "21");
        p.store(new FileOutputStream("props.properties"), "this is comment");

        Enumeration<String> e = (Enumeration<String>) p.propertyNames();
        while (e.hasMoreElements()) {
            String string = (String) e.nextElement();
            System.out.println(string);
//            age
//            username
        }
    }
    private static void test2() throws IOException {
        Properties p2 = new Properties();
        p2.load(new FileInputStream("props.properties"));
        System.out.println(p2.getProperty("age")); // 21
    }
}
