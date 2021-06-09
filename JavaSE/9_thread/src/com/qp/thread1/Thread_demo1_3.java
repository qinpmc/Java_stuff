package com.qp.thread1;

//  匿名内部类 实现多线程
public class Thread_demo1_3 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println("aaaaa");
                };
            }
        }.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("bbbb");
                }
            }
        }).start();
    }

}

