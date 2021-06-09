package com.qp.orientObj8;

public class MethodRewrite {

    public static void main(String[] args) {
        S1 s = new  S1();
        s.say();
    }

}

class F1{
    private String name;
    public void say(){
        System.out.println("f1f1...say");
    }

    public static void eat(){
        System.out.println("f1 eat");
    }
    public F1(){}
}

class S1 extends F1{
    private String name;

    public void say(){  //重写父类方法
        System.out.println("s1s1...say");
    }

    protected void say(double n){  //改变输入参数,不算重写
        System.out.println("double:"+n);
    }
    protected int say(int n){ //改变输入参数和返回值类型,不算重写
        System.out.println("int:"+n);
        return n;
    }
    //	编译错误：
/*	public int say(){    //改变返回值类型，不算重写父类方法
			return 1;
	}*/

    public static void eat(){
        System.out.println("s1 eat");
    }
}

