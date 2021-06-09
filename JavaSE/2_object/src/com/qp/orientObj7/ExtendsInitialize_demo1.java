package com.qp.orientObj7;


/*
类的初始化：
1 类加载器加载类（会执行 static 静态代码块）
2 成员变量初始化：默认初始化，显示初始化-赋值，构造方法初始化（如果有构造代码块，先于构造方法执行）
3 子父类的初始化：先进行父类初始化，然后进行父类初始化（分层进行）
*/

public class ExtendsInitialize_demo1 {
    public static void main(String[] args) {
        new Z();
 /*
        Y
        X
        Y
        Z
        */
    }
}

class X{
    Y y = new Y();
    X(){
        System.out.println("X");
    }
}

class Y{
    Y(){
        System.out.println("Y");
    }
}

class Z extends X{
    Y y = new Y();
    Z(){
        //super(); //此处可以认为先调用父类无参构造，但实际是父类先 分层 进行初始化（包含了成员变量初始化,构造方法初始化等)，然后进行子类 成员变量初始化和构造方法初始化等)
        System.out.println("Z");
    }
}