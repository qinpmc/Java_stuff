package com.qp.common2;

// 垃圾回收
public class System_demo14 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Demo();  //产生垃圾
            System.gc(); //运行垃圾回收器
        }
    }
}

class Demo{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾回收了");
    }
}