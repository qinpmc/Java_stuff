package com.qp.generic;

//  非泛型类中有泛型方法
public class Generic_demo4_2 {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.show("haha"); // haha
        gm.show(true); // true
        gm.show(9); // 9

    }
}

// 非泛型类中有泛型方法
class GenericMethod {
    // 这是泛型方法
    public <T> void show(T t){
        System.out.println(t);
    }
}
