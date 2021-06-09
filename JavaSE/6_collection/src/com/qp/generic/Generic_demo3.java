package com.qp.generic;


// 泛型方法
public class Generic_demo3 {
    public static void main(String[] args) {

        // 使用 GenericMethod_Wrong 下的show方法，针对不同类型的参数，需要创建不同的类型的类，才可以使用
        GenericMethod_Wrong<String> gm_w1 = new GenericMethod_Wrong<>();
        gm_w1.show("haha"); // haha

        GenericMethod_Wrong<Boolean> gm_w2 = new GenericMethod_Wrong<>();
        gm_w2.show(true); // true

        GenericMethod_Wrong<Number> gm_w3 = new GenericMethod_Wrong<>();
        gm_w3.show(9); // 9

        ///////////////////////////////////////

        GenericMethod_Right gm_r = new GenericMethod_Right();
        gm_r.show("haha"); // haha
        gm_r.show(true); // true
        gm_r.show(9); // 9
    }
}

//
class GenericMethod_Wrong <T>{
    // 这种方式的方法，不是泛型方法
    public void show(T t){
        System.out.println(t);
    }
}

class GenericMethod_Right{
    // 这是泛型方法
    public <T> void show(T t){
        System.out.println(t);
    }
}