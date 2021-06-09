package com.qp.thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread_demo6 {
    public static void main(String[] args) {
        MyThread6 t  = new MyThread6();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class MyThread6 implements Runnable {
    private int tickets = 1000;
    private Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            try{
                lock.lock();//
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "..." + tickets--); //
                }else {
                    break;
                }
            }finally {
                lock.unlock(); //最好放在finally中，确保锁释放
            }
        }
    }
}