package com.qp.thread1;

//  runnable 实现多线程
public class Thread_demo1_2 {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread th1 = new Thread(my);
        Thread th2 = new Thread(my);

        th1.start();
        th2.start();

    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
