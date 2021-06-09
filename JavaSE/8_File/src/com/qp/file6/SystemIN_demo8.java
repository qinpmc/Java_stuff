package com.qp.file6;

import java.io.IOException;
import java.io.InputStream;

public class SystemIN_demo8 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int x = is.read();
        System.out.println(x); //输入a --打印97
    }
}
