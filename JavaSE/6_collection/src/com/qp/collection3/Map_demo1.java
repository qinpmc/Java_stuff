package com.qp.collection3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// map遍历
public class Map_demo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("zhangsan", 23);
        map.put("zhangsan", 26);// 替换前一个key 为zhangsan的值
        map.put("lisi", 24);
        map.put("wagnwu", 25);

        // print1(map); // lisi :24  wagnwu :25  zhangsan :26
        // print2(map);// lisi :24  wagnwu :25  zhangsan :26
        // print22(map);// lisi :24  wagnwu :25  zhangsan :26

        print3(map);
    }

    // map-根据 key遍历,然后根据keyset的 遍历器
    public static void print1(Map map){
        Set<String> keySet  = map.keySet();
        Iterator<String>  keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            System.out.println(key + " :" + map.get(key));
        }
    }
    // map-根据 key遍历,,然后使用 forEach 遍历 keyset ，同print1
    public static void print12(Map map){
        Set<String> keySet  = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " :" + map.get(key));
        }
    }


    // map -- 根据entrySet 遍历，然后根据Iterator遍历器
    public static void print2(Map<String, Integer> map){
        Set<Map.Entry<String, Integer>> setEntry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> isetEntry = setEntry.iterator();
        while (isetEntry.hasNext()) {
            Map.Entry<String, Integer> entry = isetEntry.next();
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }

    //  map -- 根据entrySet 遍历,然后通过foreach，常用这种
    public static void print22(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void print3(Map<String, Integer> map){
        //遍历map中的键
        for (String key : map.keySet()) {
            System.out.println("Key = " + key);
        }
        //遍历map中的值
        for (Integer value : map.values()) {
            System.out.println("Value = " + value);
        }
    }
}
