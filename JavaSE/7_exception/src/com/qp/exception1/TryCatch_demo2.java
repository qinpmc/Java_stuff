package com.qp.exception1;

import java.io.FileNotFoundException;
import java.io.IOException;

// jdk7的新特性，一个catch语句中可以捕获多种异常，以 | 分割
public class TryCatch_demo2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int[] arr = {1, 2};
        try {
            int a = Integer.valueOf("aaa"); // // 会报NumberFormatException已经被捕获
            throw new FileNotFoundException();

        }//  catch (NumberFormatException | RuntimeException  e) { // 错误：RuntimeException 为NumberFormatException 父类，不能平级使用
        catch (NumberFormatException | FileNotFoundException e) {
            try {
                throw new IOException(); // 抛出新的异常
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println("--end--");  // 执行
    }
}
