package com.qp.generic;

// extends 例子2 --泛型方法上指定上限
public class Generic_demo7_2 {
    public static void main(String[] args) {
        Mammal a1 = new Mammal();
        Person p1 =new Person();
        Student s1 =new Student();

        GenericTools<Mammal> g1 = new GenericTools<>(a1);
        GenericTools<Person> g2 = new GenericTools<>(p1);
        GenericTools<Person> g3 = new GenericTools<>(s1);
        // showKeyName(g1); //编译错误 ,showKeyName 只能接收GenericTools 类型为 Person及其子类的对象
        showKeyName(g2);
        showKeyName(g3);
    }


    // 泛型方法上指定上限
    public static <T extends Person> T showKeyName(GenericTools<T> container){
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }
}
class GenericTools<T>{
    private T key;
    public GenericTools(T key) {
        this.key = key;
    }
    public T getKey(){ //
        return key;
    }
}

class Mammal{ // 哺乳动物

}
class Person extends Mammal{

}
class Student extends Person{

}