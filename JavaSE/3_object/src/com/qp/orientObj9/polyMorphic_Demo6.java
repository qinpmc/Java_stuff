package com.qp.orientObj9;

public class polyMorphic_Demo6 {
    public static void main(String[] args) {
        A a = new B(); //多态
        a.show(); //B , 成员方法 访问子类的

        B ba = (B)a;
        ba.show(); //B  向下转型后，成员方法 访问子类的

        B b = new C();
        b.show(); //C , 成员方法 访问子类的

        C cb = (C)b;
        cb.show(); //C  向下转型后，成员方法 访问子类的

    }
}
class A{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B");
    }
}
class C extends B{
    public void show(){
        super.show();
    }
    public void show2(){
        System.out.println("C");
    }
}

