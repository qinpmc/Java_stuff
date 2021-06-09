package com.qp.thread1;

public class Thread_demo5 {
    public static void main(String[] args) {
        Father f = new Father();
        f.start();
//        Son thread run...
//        Son thread over...
//        Father thread run...

    }
}
//上面的有两个类Father(主线程类)和Son(子线程类)。因为Son是在Father中创建并启动的，所以，Father是主线程类，Son是子线程类。
//在Father主线程中，通过new Son()新建“子线程s”。接着通过s.start()启动“子线程s”，并且调用s.join()。
//在调用s.join()之后，Father主线程会一直等待，直到“子线程s”运行完毕；在“子线程s”运行完毕之后，Father主线程才能接着运行。
//这也就是我们所说的“join()的作用，是让主线程会等待子线程结束之后才能继续运行”！

// 主线程
 class Father extends Thread {
    public void run() {
        Son s = new Son();
        s.start();
        try {
            s.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Father thread run...");
    }
}
// 子线程
 class Son extends Thread {
    public void run() {
        System.out.println("Son thread run...");
        System.out.println("Son thread over...");
    }
}