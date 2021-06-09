package com.qp.thread2;

//
public class Thread_demo3 {
    public static void main(String[] args) {
        //test1_wrong();
        test2();
    }
    private static void test1_wrong(){
        Printer p = new Printer();
        new Thread(){         //第一个线程也使用 p 的方法
            public void run(){
                for (int i = 0; i <100; i++) {
                    p.print1();
                }

            }
        }.start();
        new Thread(){         //第二个线程也使用 p 的方法
            public void run(){
                for (int i = 0; i < 100; i++) {
                    p.print2();
                }
            }
        }.start();
    }

    private static void test2(){
        Printer2 p = new Printer2();
        new Thread(){         //第一个线程也使用 p 的方法
            public void run(){
                for (int i = 0; i <100; i++) {
                    p.print1();
                }

            }
        }.start();
        new Thread(){         //第二个线程也使用 p 的方法
            public void run(){
                for (int i = 0; i < 100; i++) {
                    p.print2();
                }
            }
        }.start();
    }

}


class Printer {      //非正确的代码
    public void print1(){
        System.out.print("中");
        System.out.print("华");
        System.out.print("人");
        System.out.print("民");
        System.out.println("");
    }
    public void print2(){
        System.out.print("热");
        System.out.print("干");
        System.out.print("面");
        System.out.println("");
    }
}


class Printer2 {      //非正确的代码
    public void print1(){
        synchronized(Printer2.class){
            System.out.print("中");
            System.out.print("华");
            System.out.print("人");
            System.out.print("民");
            System.out.println("");
        }

    }
    public void print2(){
        synchronized(Printer2.class){
            System.out.print("热");
            System.out.print("干");
            System.out.print("面");
            System.out.println("");
        }
    }
}
