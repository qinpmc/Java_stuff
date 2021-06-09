package com.qp.orientObj9;

public class Interface_Demo10 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.NUM); //100
        System.out.println(Inter.NUM);//100,静态的
    }
}
interface Inter{
    int NUM = 100; //默认public static final,顺序可互换
    //protected int NUM = 1000; //编译错误 protected not allow here
    void print();  //默认 public abstract
    //public Inter(){} ;//接口没有构造方法 ，编译错误 Interface methods cannot have body
	/*public void say(){  //接口不能定义非抽象方法，编译错误，Interface methods cannot have body
	}*/
}
class Test1 implements Inter{
    @Override
    public void print() {
        //NUM = 200; //error，错误，接口的变量用final修饰
        System.out.println("Test1 print");
    }
}

interface InterA{
    void printA();
}
interface InterB{
    void printB();
}

// 接口可以多继承
interface InterC extends InterA,InterB{
    void printC();
}

