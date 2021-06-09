package com.qp.collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

// 利用 HashSet 和 LinkedHashSet 去重
public class Set_demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");

        //2,单独定义方法去除重复
        //getSingleByHashSet(list); // [a, b, c]
        getSingleByLinkedHashSet(list); // [a, b, c]

        //3,打印一下List集合
        System.out.println(list);
    }

    public static void getSingleByLinkedHashSet(List<String> list) {
        //1,创建一个LinkedHashSet集合
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //2,将List集合中所有的元素添加到LinkedHashSet集合
        lhs.addAll(list);
        //3,将list集合中的元素清除
        list.clear();
        //4,将LinkedHashSet集合中的元素添加回List集合中
        list.addAll(lhs);
    }

    public static void getSingleByHashSet(List<String> list) {
        //1,创建一个 HashSet集合
        HashSet<String> hs = new HashSet<>();
        //2,将List集合中所有的元素添加到HashSet集合
        hs.addAll(list);
        //3,将list集合中的元素清除
        list.clear();
        //4,将HashSet集合中的元素添加回List集合中
        list.addAll(hs);
    }
}

