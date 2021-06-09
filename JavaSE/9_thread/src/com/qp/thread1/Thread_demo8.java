package com.qp.thread1;

public class Thread_demo8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println(this.getName()+" .....Daemon"+i);
                }

            }
        };

        t1.setDaemon(true); //t1设为守护线程，不会执行到100次
        t1.start();
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        //主线程执行完毕，t1守护线程结束， 不会执行到100次
    }
}

