package com.qp.collection3;

import java.util.HashMap;
import java.util.Map;

// HashMap 嵌套 HashMap
public class Map_demo6 {
    public static void main(String[] args) {
        HashMap<String,HashMap<String,Integer>> studentInfos = new HashMap<>();

        // dragon 班级
        HashMap<String,Integer> dragonClassInfos = new HashMap<>();
        dragonClassInfos.put("令狐冲",21);
        dragonClassInfos.put("杨过",22);
        studentInfos.put("dragon",dragonClassInfos);

        // tiger 班级
        HashMap<String,Integer> tigerClassInfos = new HashMap<>();
        tigerClassInfos.put("向问天",43);
        tigerClassInfos.put("虚竹",20);
        studentInfos.put("tiger",tigerClassInfos);

        // 遍历
        for(Map.Entry<String,HashMap<String,Integer>> entrySet:studentInfos.entrySet()){
            String key = entrySet.getKey();
            HashMap<String,Integer> hashMapValue = entrySet.getValue();
            for(Map.Entry<String,Integer> eSet: hashMapValue.entrySet()){
                System.out.println(key+"班级包含: "+eSet.getKey()+"--"+eSet.getValue());
//                dragon班级包含: 令狐冲--21
//                dragon班级包含: 杨过--22
//                tiger班级包含: 向问天--43
//                tiger班级包含: 虚竹--20
            }
        }
    }
}
