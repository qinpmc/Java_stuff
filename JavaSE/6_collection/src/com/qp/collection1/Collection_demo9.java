package com.qp.collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// ListIterator 的 previousIndex
public class Collection_demo9 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("qq1");
        l1.add("qq2");
        l1.add(1,"qq3");

        ListIterator<String> li1 = l1.listIterator();
        while(li1.hasNext()){
            System.out.println(li1.next()); // qq1  qq3  qq2
        }
        System.out.println("-----------");
        while(li1.hasPrevious()){
            System.out.println(li1.previousIndex()); //2 ,1 , 0
            System.out.println(li1.previous()); //qq2、qq3、qq1
            System.out.println(li1.previousIndex()); //1 ,0 , -1
            System.out.println("************");
        }
    }

}
