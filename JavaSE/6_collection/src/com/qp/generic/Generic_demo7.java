package com.qp.generic;

// extends 例子1 --类指定上限
public class Generic_demo7 {
    public static void main(String[] args) {
        Info<Integer> i = fun(30) ;
        System.out.println(i.getVar()); // 30

        Info<Double> d = fun(29.9) ;
        System.out.println(d.getVar()); // 29.9

        // Info<String> s = fun("1") ; 编译报错，Info 只能是Number及其子类

    }
    public static <T extends Number> Info<T> fun(T param){
        Info<T> temp = new Info<T>() ;      // 根据传入的数据类型实例化Info
        temp.setVar(param) ;
        return temp ;
    }


}
class Info<T extends Number>{ // 类指定上限，只能是数字类型
    private T var ;     // 此类型由外部决定
    public T getVar(){
        return this.var ;
    }
    public void setVar(T var){
        this.var = var ;
    }
    public String toString(){
        return this.var.toString() ;
    }
};




