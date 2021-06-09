package com.qp.reflect2;

//静态代理
public class Static_Proxy_demo1 {
    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.sayHello();

//        Before invoke sayHello
//        Hello zhanghao!
//        After invoke sayHello
    }
}

interface HelloInterface {
    void sayHello();
}

class Hello implements HelloInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello zhanghao!");
    }
}

class HelloProxy implements HelloInterface{
    private HelloInterface helloInterface = new Hello();
    @Override
    public void sayHello() {
        System.out.println("Before invoke sayHello" );
        helloInterface.sayHello();
        System.out.println("After invoke sayHello");
    }
}