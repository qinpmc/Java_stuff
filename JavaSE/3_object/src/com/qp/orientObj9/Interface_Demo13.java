package com.qp.orientObj9;

// 接口与抽象类，父类重名的方法 --示例
public class Interface_Demo13 {
    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.say(); //tomcat say

        NetherLandPig netherLandPig = new NetherLandPig();
        netherLandPig.say(); //pig say
    }
}

interface Iff1{
    void say();
}

abstract class SayAnimal{
    abstract void say();
}

// 类继承抽象类和接口，抽象类和接口有同样的方法，需实现
class Tomcat extends SayAnimal implements Iff1 {
    public void say(){
        System.out.println("tomcat say");
    }
}

class Pig{
    public void say(){
        System.out.println("pig say");
    }
}

// 继承 类和接口，超类和接口有同样的方法，改类可不实现 接口的方法
class NetherLandPig extends Pig implements Iff1{

}

