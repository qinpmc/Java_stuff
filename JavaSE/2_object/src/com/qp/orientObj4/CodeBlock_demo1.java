package com.qp.orientObj4;


// 代码块， 静态代码块 ，构造函数执行顺序 示例
public class CodeBlock_demo1 {
    static {
        System.out.println("main方法外的静态代码块");
    }


    public static void main(String[] args) {
        System.out.println("我是main方法");
        {
            System.out.println("main方法中的代码块---");
        }
        Student s1 = new Student();
        Student s2 = new Student();
    }

    {
        //此代码不执行---没有代码 实例化 CodeBlock_demo1，构造代码块不执行
        System.out.println("main方法外的代码块---");
    }
}

class Student {
    static {
        System.out.println("Student 静态代码块");
    }

    public Student() {
        System.out.println("Student 构造方法");
    }
    {
        System.out.println("Student 构造代码块");
    }

}
