package com.qp.thread2;

public class Thread_demo4 {
    public static void main(String[] args) {
        //test1();
        test2();

    }
    private static void test1(){
        Printer4_1 p = new Printer4_1();
        new Thread(){
            public void run(){
                for (int i = 0; i <500; i++) {
                    p.print1();
                }

            }
        }.start();
        new Thread(){
            public void run(){
                for (int i = 0; i < 500; i++) {
                    p.print2();
                }
            }
        }.start();
    }

    private static void test2(){
        Printer4_2 p = new Printer4_2();
        new Thread(){
            public void run(){
                for (int i = 0; i <500; i++) {
                    p.print1();
                }

            }
        }.start();
        new Thread(){
            public void run(){
                for (int i = 0; i < 500; i++) {
                    p.print2();
                }
            }
        }.start();
    }

}

class Printer4_1 {
    public void print1(){
        synchronized(this){     //加上同步代码,保证是一个对象作为锁
            System.out.print("中");
            System.out.print("华");
            System.out.print("共");
            System.out.print("和");
            System.out.print("国");
            System.out.println("");
        }
    }
    public synchronized void print2(){ //非静态同步方法的锁对象为this
        System.out.print("武");
        System.out.print("汉");
        System.out.print("热");
        System.out.print("干");
        System.out.print("面");
        System.out.println("");
    }
}

class Printer4_2 {
    public void print1(){
        synchronized(Printer4_2.class){     //加上同步代码,保证是一个对象作为锁
            System.out.print("中");
            System.out.print("民");
            System.out.print("共");
            System.out.print("和");
            System.out.print("国");
            System.out.println("");
        }
    }
    public static synchronized void print2(){ // 静态同步方法的锁对象为字节码对象
        System.out.print("武");
        System.out.print("汉");
        System.out.print("热");
        System.out.print("干");
        System.out.print("面");
        System.out.println("");
    }
}
