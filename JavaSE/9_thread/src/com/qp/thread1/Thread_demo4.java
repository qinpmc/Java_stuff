package com.qp.thread1;

public class Thread_demo4 {
    public static void main(String[] args) {
        MyThread_4 t1 = new MyThread_4();
        t1.start();
    }
}

class MyThread_4 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println(getName()+"----"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}