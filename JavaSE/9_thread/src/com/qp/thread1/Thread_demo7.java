package com.qp.thread1;

// Thread.yield()
public class Thread_demo7 {
    public static void main(String[] args) {
        MyThread_7 t1 = new MyThread_7();
        MyThread_7 t2 = new MyThread_7();
        t1.start();
        t2.start();

    }
}
class MyThread_7 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println(getName()+"----"+i);
            Thread.yield();
        }
    }
}