package com.qp.orientObj6;


// 子类默认调用父类的无参构造函数
public class ExtendsConstructor_demo2 {
    public static void main(String[] args) {
        Son2 s2 = new Son2();
        Son2 s22 = new Son2(32);
        System.out.println(s22.age);
    }

}
class Father2{
    private String name;
    int age;
    protected void breath(){
        System.out.println("breath");
    }
    public void eat(){
        System.out.println("eat...");
    }
    public Father2(){
        System.out.println("Father无参构造方法");
    }

    public Father2(int age){

        System.out.println("Father有参构造方法");
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

class Son2 extends Father2{
    public Son2(){
//super(); //隐藏的执行
        System.out.println("Son无参构造方法");
    }
    public Son2(int age){
//super(); //隐藏的执行
        System.out.println("Son有参构造方法");
        this.age =age;
    }
}

