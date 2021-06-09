package com.qp.collection1;


import java.util.*;

// iterator 细节
public class Collection_demo8 {
    public static void main(String[] args) {
        // test1();
        test2();
        // test3();
        //test4();
    }

    // 测试  Iterator remove的 索引
    public static void test1() {
        Collection<String> c1 = new ArrayList<String>();
        c1.add("qq1");
        c1.add("qq2");
        c1.add("qq3");
        Iterator<String> iterator = c1.iterator();

        String s1 = iterator.next(); // 返回容器中第一个对象
        System.out.println(s1); // qq1
        iterator.remove(); //  移除遍历器上次 next 返回的 对象，如果不调用 iterator.next()，运行出现 java.lang.IllegalStateException

        System.out.println(c1); // [qq2, qq3]

    }

    //// 测试  Iterator add 的 索引 --与 iterator 无关
    public static void test2(){
        Collection<String> c1 = new ArrayList<String>();
        c1.add("qq1");
        c1.add("qq2");
        c1.add("qq3");
        Iterator<String> iterator = c1.iterator();
        iterator.next();
        c1.add("qq4");
        System.out.println(c1);  // [qq1, qq2, qq3, qq4]
    }

    public static void test3() {
        List<String> c1 = new ArrayList<String>();
        c1.add("qq1");
        c1.add("qq2");
        c1.add("qq3");
        //ListIterator<String> iterator =  c1.listIterator();
        Iterator<String> iterator =  c1.iterator();
        while (iterator.hasNext()){
            if("qq2" == iterator.next()){

                //iterator.remove(); // 可行
                //c1.remove("qq2"); // 可行，和上行代码等价，不报错 iterator 可以remove
                c1.add("qq22"); // 异常 ！！ java.util.ConcurrentModificationException
                //iterator.add("wow");  // iterator 没有add
            }
        }
        System.out.println(c1); // [qq1, qq2, wow, qq3]
    }

    // 使用 list 自身遍历 进行 添加
    public static void test4(){
        List<String> c1 = new ArrayList<String>();
        c1.add("qq1");
        c1.add("qq2");
        c1.add("qq3");
        for(int i=0;i<c1.size();i++){
            if("qq2" == c1.get(i)){
                c1.add(i+1,"wow"); //[qq1, qq2, wow, qq3] ,注意 add(i+1,..),如果是add(i,..)死循环
            }
        }
        System.out.println(c1);
    }
}
