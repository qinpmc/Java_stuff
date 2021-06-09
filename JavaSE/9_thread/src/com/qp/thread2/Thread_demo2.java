package com.qp.thread2;

public class Thread_demo2 {
    public static void main(String[] args) {
        MyRunnable_2 my = new MyRunnable_2();

        Thread th1 = new Thread(my,"窗口1");
        Thread th2 = new Thread(my,"窗口2");
        Thread th3 = new Thread(my,"窗口3");

        th1.start();
        th2.start();
        th3.start();
    }
}

class MyRunnable_2 implements Runnable{
    private static int tickets = 100;
    private static Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (lock){
                if(tickets>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在售票: "+(tickets--)+"张票");
                }
            }
        }
    }
}