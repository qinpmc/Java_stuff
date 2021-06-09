package com.qp.thread2;

//extends Thread 方式：
public class Thread_demo5_1 {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}


class MyThread extends Thread{
    private static int tickets = 1000;
    //private   int tickets = 100; //不能是非静态局部变量，这样会使得每个实例对象拥有各自不同的100张票
    public void run(){
        while(true){
            synchronized(MyThread.class){  //锁对象不能为this，因为各个实例对象并不同
                if(tickets<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+"..."+tickets--); //
            };
        }
    }
}
