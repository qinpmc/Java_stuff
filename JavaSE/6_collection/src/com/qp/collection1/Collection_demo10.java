package com.qp.collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// forEach
public class Collection_demo10 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        //remove1(list);

        // remove2(list);

        remove3(list); // 错误
    }

    public static void remove1(List list) {
        for (int i = 0; i < list.size(); i++) {
            if ("b".equals(list.get(i))) {
                list.remove(i--);
            }
        }
        System.out.println(list); // a c d
    }

    public static void remove2(List list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            if ("b".equals(i.next())) {
                i.remove();
            }
        }
        System.out.println(list); // a c d
    }

    public static void remove3(List<String> list) {
        for (String str : list) { //foreach 只能遍历
            if ("b".equals(str)) {
                list.add("b"); //ConcurrentModificationException
                //list.remove("b");//ConcurrentModificationException
            }
        }
    }
}
