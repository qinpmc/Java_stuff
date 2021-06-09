package com.qp.thread1;

public class Thread_demo9 {
    public static void main(String[] args) {
        MyThread_9 t1 = new MyThread_9();
        t1.start();
        try {
            Thread.sleep(3000);
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");

    }
}

class MyThread_9 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println(getName()+"----"+i);
            if(i==5){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("异常了");
                    e.printStackTrace();
                }
                System.out.println("线程终止了。。");
            }
        }
    }
}