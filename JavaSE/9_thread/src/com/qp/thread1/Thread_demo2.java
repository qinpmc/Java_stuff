package com.qp.thread1;

public class Thread_demo2 {
    public static void main(String[] args) {
        MyThread_2 thread1 = new MyThread_2();
        MyThread_2 thread2 = new MyThread_2();
        thread1.setName("test1");
        thread2.setName("test2");

        thread1.start();
        thread2.start();

        System.out.println(Thread.currentThread().getName()); //main

        new Thread(){
            //this.setName("myThread1"); //错误位置
            public void run(){
                this.setName("myThread1");
                System.out.println(this.getName()+" .....!!!"); //myThread1 .....!!!
            }
        }.start();


        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(this.getClass()); //class com.qp.thread1.Thread_demo2$2
                System.out.println(Thread.currentThread().getName()); //Thread-3，此处用this --- 无法使用getName方法，this此时是Runnable的子类对象
            }
        }).start();

    }
}

class MyThread_2 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println(getName()+"__"+i);
        }
    }
}