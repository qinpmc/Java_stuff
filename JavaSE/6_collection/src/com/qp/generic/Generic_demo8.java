package com.qp.generic;

public class Generic_demo8 {
    public static void main(String[] args) {

        Plant a1 = new Plant();
        Fruit p1 =new Fruit();
        Apple s1 =new Apple();
        GenericToolkit<Plant> g1 = new GenericToolkit<Plant>(a1);
        GenericToolkit<Fruit> g2 = new GenericToolkit<Fruit>(p1);
        GenericToolkit<Apple> g3 = new GenericToolkit<Apple>(s1);

        //Info2<Fruit> i1 = fun(a1) ;  //error
        Info2<Fruit> i2 = fun(p1) ;
        Info2<Fruit> i3 = fun(s1) ;
        System.out.println(i2.getVar());
        System.out.println(i3.getVar());
        //showKeyName(g1); //error
        showKeyName(g2);
        showKeyName(g3);

    }
    public static <T extends Fruit> Info2<T> fun(T param){
        Info2<T> temp = new Info2<T>() ;      // 根据传入的数据类型实例化Info
        temp.setVar(param) ;        // 将传递的内容设置到Info对象的var属性之中
        return temp ;   // 返回实例化对象
    }
    public static <T extends Fruit> T showKeyName(GenericToolkit<T> container){
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }

}
class Info2<T extends Fruit>{ // 指定上限，只能是数字类型
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

class GenericToolkit<T>{
    private T key;
    public GenericToolkit(T key) {
        this.key = key;
    }
    public T getKey(){ //
        return key;
    }
}

class Plant{

}
class Fruit extends Plant{

}
class Apple extends Fruit{

}

