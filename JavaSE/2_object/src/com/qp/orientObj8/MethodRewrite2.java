package com.qp.orientObj8;

public class MethodRewrite2 {
    public static void main(String[] args) {
        So1 s1 = new So1();
        Person a1 = s1.method(); // 子类So1覆写 父类Fa1  method 方法，返回的是子类 Person，非父类Animal，可以算是方法覆写

        //Animal a1 = s1.method(); // 子类So1覆写 父类Fa1  method 方法，返回的是父类Animal，可以算是方法覆写

        a1.print(); //person
    }
}

class LivingThings {
    public void print(){
        System.out.println("LivingThings");
    }
}

class Animal extends LivingThings {
    public void print(){
        System.out.println("animal");
    }
}
class Person extends Animal{
    public void print(){
        System.out.println("person");
    }
}

class Fa1 {
    public Animal method(){
        return new Animal();
    }
}
class So1 extends Fa1{
    public Person method(){  //子类重写方法的返回值Person 是父类该方法返回值Animal 的子类，可以算是方法覆写
        return new Person();
    }

/*    public Animal method(){  //子类重写方法的返回值Animal 和 父类该方法返回值Animal 相同，可以算是方法覆写
        return new Animal();
    }*/


/*    public LivingThings method(){  //子类重写方法的返回值LivingThings 是父类该方法返回值Animal 的父类，编译失败
        return new LivingThings();
    }*/
}

