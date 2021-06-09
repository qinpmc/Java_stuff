package com.qp.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collections
public class Collections_demo8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        Collections.sort(list);
        System.out.println(list); //[10, 20, 30, 40, 50]

        System.out.println(Collections.binarySearch(list,30)); // 2
        System.out.println(Collections.binarySearch(list,90));// -6

        Collections.shuffle(list);
        System.out.println(list); // shuffle 结果不固定 [10, 20, 40, 50, 30]
    }
}
