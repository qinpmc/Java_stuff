package com.qp.generic;

import java.util.ArrayList;
import java.util.List;

// 通配符
public class Generic_demo6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("hello");
        test(arrayList); //hello

        //test_wrong(arrayList);// 编译失败 ，List<Object> test =  new ArrayList<String>() 不合法，非多态

        GenericTool<String> genericTool1 = new GenericTool<>();
        GenericTool<Integer> genericTool2 = new GenericTool<>();
        System.out.println(genericTool1.getClass() == genericTool2.getClass()); //true  ,均为 class com.qp.generic.GenericTool

        List<?> strings = arrayList;
        //strings.add("abc"); // 编译失败，编译器不能对 List 的类型参数作出足够严密的推理，以确定将 String 传递给 List.add() 是类型安全的。所以编译器将不允许这么做
    }

    public static void test(List<?> list){
        for (int i = 0; i <list.size() ; i++) {
            // if(i>1) test.add("No"); // 编译报错，不能存
            System.out.println(list.get(i));
        }
    }

    public static void test_wrong(List<Object> test){
        for (int i = 0; i <test.size() ; i++) {
            System.out.println(test.get(i));
        }
    }
}

class GenericTool<T>{
    private T obj;
    public T getObj(){
        return obj;
    }
    public void setObj(T obj){
        this.obj = obj;
    }
}