package com.qp.thread2;

//implements Runnable 方式
public class Thread_demo5_2 {
    public static void main(String[] args) {
        MyThread2 t  = new MyThread2();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();

    }
}

class MyThread2  implements Runnable{
    private  int tickets = 1000;
    public void run(){
        while(true){
            synchronized(MyThread2.class){ //注意 synchronized  在 while true 内部
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
