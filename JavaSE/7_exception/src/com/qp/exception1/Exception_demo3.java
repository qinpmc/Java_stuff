package com.qp.exception1;

// 编译时异常 -- 运行时异常
public class Exception_demo3 {
    public static void main(String[] args) {
        // testRuntimeException(); // 不用try -catch 处理也行

        try {
            testException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 抛出运行时异常 -- 可以不处理
    public static void testRuntimeException(){
        int a = 10;
        int b = 0;
        if(b==0){
            throw new ArithmeticException();
        }else{
            System.out.println(a/b);
        }
    }

    // 抛出编译时异常 -- 必须处理，此处为 throws
    public static void testException() throws Exception {
        int a = 10;
        int b = 0;
        if(b==0){
            throw new Exception();
        }else{
            System.out.println(a/b);
        }
    }
}
