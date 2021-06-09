package com.qp.thread1;

public class Thread_demo3 {
    public static void main(String[] args) {
        MyThread_3 t1 = new MyThread_3();
        MyThread_3 t2 = new MyThread_3();
        t1.setPriority(10);
        t1.setPriority(1);
        t1.start();
        t2.start();

    }
}
class MyThread_3 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println(getName()+"**"+i);
        }
    }
}