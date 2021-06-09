package com.qp.orientObj10;

// 匿名内部类 -- 匿名类实现抽象类
public class InnerClass_demo8 {

    public static void main(String[] args) {
        PersonDemo pd = new PersonDemo ();
        pd.method(new Person(){
            public void show() {
                System.out.println("p1");
            }

        }); // p1
    }
}
abstract class Person { //抽象类或接口 均可
    public abstract void show();
}

class PersonDemo {
    public void method(Person p) {
        p.show();
    }
}

