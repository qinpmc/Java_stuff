package com.qp.thread1;

public class Thread_demo10 {
    public static void main(String[] args) {
        ThreadStop ts = new ThreadStop();
        ts.start();
        try {
            Thread.sleep(3*1000);
            ts.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main ...try catch");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}

class ThreadStop extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" : start");
        try{
            Thread.sleep(10*1000);
        }  catch (InterruptedException e) {
            System.out.println("线程终止了");
            e.printStackTrace();
        }
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }

        System.out.println(Thread.currentThread().getName()+" : end");
    }
}