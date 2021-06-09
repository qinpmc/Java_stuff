package com.qp.collection1;

import java.util.Enumeration;
import java.util.Vector;

public class Collection_demo11 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("java");

        for(int i=0;i<vector.size();i++){
            System.out.println(vector.elementAt(i));  // hello  world  java
        }
        System.out.println("**********************");

        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());  // hello  world  java
        }
    }
}
