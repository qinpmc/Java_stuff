package com.qp.collection2;

import java.util.*;

// 得到 排序的、不重复的 list
public class TreeSet_demo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("add");
        list.add("add");
        list.add("cda");
        list.add("wsa");
        list.add("zzz");
        System.out.println(list); // [add, add, cda, wsa, zzz]

        List<String> newList = getSortedList(list); // 去重 排序
        System.out.println(newList); // [add, cda, wsa, zzz]

    }
    // 去重 排序
    public static List<String> getSortedList(List<String> list){
        //匿名内部类实现比较器
        Set<String> set = new TreeSet<String>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }

        });
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}

