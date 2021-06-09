package com.qp.thread1;

public class Thread_demo1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println(i);
        }
    }
}
