package com.qp.orientObj6;


// 子类默认调用父类的无参构造函数
public class ExtendsConstructor_demo1 {
    public static void main(String[] args) {
        Son son = new Son();
        //     Father 无参构造
        //     Son 无参构造

        Son son2 = new Son("mary");
        //     Father 无参构造
        //     Son 有参构造

    }
}

class Father {
    public Father(){
        System.out.println("Father 无参构造");
    }

    public Father(String name){
        System.out.println("Father 有参构造");
    }
}

class Son extends Father{
    public Son(){
        System.out.println("Son 无参构造");
    }

    public Son(String name){
        System.out.println("Son 有参构造");
    }
}