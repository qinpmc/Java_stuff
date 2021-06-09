package com.qp.thread2;

//implements Runnable 方式
public class Thread_demo5_3 {
    public static void main(String[] args) {
        MyThread3 t  = new MyThread3();

        new Thread(t,"线程2").start();
        new Thread(t,"线程1").start();
        new Thread(t,"线程3").start();
    }
}

class MyThread3 implements Runnable{
    private int tickets = 1000;
    public void run(){
        synchronized(MyThread3.class){//注意 synchronized  在 while true 外部，一个线程全部卖完票才解锁（此处示例是线程2）
            while(true){
                if(tickets<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"..."+tickets--); //
            };
        }
    }
}
