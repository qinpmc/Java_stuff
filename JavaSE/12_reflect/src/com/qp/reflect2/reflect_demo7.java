package com.qp.reflect2;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class reflect_demo7 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        //list.add("test1");//编译错误

        Class clazz = Class.forName("java.util.ArrayList");
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list, "test2");
        System.out.println(list); //[20, test2]
    }

}
