package com.qp.designPattern;

public class Template_design1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.getTime());
    }

}

abstract class GetTime {
    public final long getTime() {
        long start = System.currentTimeMillis();
        callMethod();
        long end = System.currentTimeMillis();
        return end - start;
    }

    public abstract void callMethod();
}

class Test1 extends GetTime {
    @Override
    public void callMethod() {
        int count = 0;
        for (int i = 0; i < 900000; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
