package com.qp.collection1;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo4 {
    public static void main(String[] args) {
        //  test1();
        // test2();
        // test3();
        test4();
    }

    public static void test1(){
        Collection c = new ArrayList();  //未加泛型
        c.add(1);  //true
        c.add("String");//true
        c.add(true);//true
        c.add(1);//true
        Object[] arr1 = c.toArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
/*			1
			String
			true
			1*/
        }
    }

    public static void test2(){
        Collection<String> c1 = new ArrayList(); //加泛型
        c1.add("qq1");
        c1.add("qq2");
        String[] arr =  c1.toArray(new String[]{});

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
/*			qq1
            qq2*/
        }
    }

    public static void test3(){
        Collection c3 = new ArrayList();    //未加泛型，默认Object
        c3.add("qq1");
        c3.add("qq2");
        c3.add(1); //加入数字!!
        String[] arr3 =  (String[]) c3.toArray(new String[]{}); //必须强转 //运行出错 java.lang.ArrayStoreException
    }

    public static void test4(){
        Collection<Dog> c4 = new ArrayList();    //
        c4.add(new Dog(2));
        c4.add(new Dog(3));
        c4.add(new Dog(2)); //
        Dog[] arr4 =   c4.toArray(new Dog[]{});
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
/*			Dog：2
            Dog：3
            Dog：2*/
        }
    }

}
class Dog{
    private int age;
    public Dog(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Dog："+this.age;
    }
}