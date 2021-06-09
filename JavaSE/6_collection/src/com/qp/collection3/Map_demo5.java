package com.qp.collection3;

import java.util.HashMap;

// 练习HashMap
public class Map_demo5 {
    public static void main(String[] args) {
        HashMap<Character,Integer> res =  recordAlphabet("abacdad");
        System.out.println(res); // {a=3, b=1, c=1, d=2}
    }

    public static HashMap<Character,Integer> recordAlphabet(String str){
        char [] characters = str.toCharArray();
        HashMap<Character,Integer> recordMap  = new HashMap<>();
        for(char character : characters){
            Integer num = recordMap.get(character);
            if( num == null){
                recordMap.put(character,1);
            }else{
                num++;
                recordMap.put(character,num);
            }
        }
        return recordMap;
    }
}
