package com.qp.orientObj6;


// this super 的示例
public class ExtendsConstructor_demo3 {
    public static void main(String[] args) {
        So s = new So();
        s.print();
        s.sSay();  //say..    1000
    }
}

class Fa{
    int num =10;
    int Fnum =1000;
    public void say(){
        System.out.println("say..");
    }
}

class So extends Fa{
    int num = 20;
    public void print(){
        int num = 30;
        System.out.println(num);       //30
        System.out.println(this.num);   //20
        System.out.println(super.num);  //10
    }
    public void sSay(){
        this.say();  //say..可用this，也可用super
        System.out.println(super.Fnum); //1000 ，可用this，也可用super
    }
}

