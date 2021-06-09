package com.qp.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Arrays.asList  List.toArray
public class Array_to_List_demo1 {
    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        test4();
    }
    public static void test1(){
        String[] arr = {"a","b","c"};
        List<String> list = Arrays.asList(arr);
        //list.add("d"); //错误，不可增加，底层仍为数组，长度不可变
        //list.remove(1); //错误，不可删除，底层仍为数组，长度不可变
        list.set(1,"new"); //可以修改
        System.out.println(list);
    }

    public static void test2(){
        int[] arr={1,2,3,4};
        //List list = Arrays.asList(arr);
        List<int[]> list = Arrays.asList(arr); //等同上句
        System.out.println(list); //[[I@15db9742]

        int[] res = list.get(0);// list 第一个元素为数组
        for(int i:res){
            System.out.println(i); // 1 2 3 4
        }

    }

    public static void test3(){
        Integer[] arr = {1,2,3,4};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list); //[1, 2, 3, 4]
    }
    //  list 转 数组
    public static void test4(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String[]  arrlist1 = list.toArray(new String[]{});
        String[]  arrlist2 = list.toArray(new String[1]);
        String[]  arrlist3 = list.toArray(new String[10]); //给定的数组长度大于集合的尺寸，则分配的数组长度与给定的一致

        System.out.println(arrlist1.length); //3
        System.out.println(arrlist2.length); //3
        System.out.println(arrlist3.length); //10

    }
}
