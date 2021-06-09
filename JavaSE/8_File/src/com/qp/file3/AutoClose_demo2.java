package com.qp.file3;

import java.io.*;

public class AutoClose_demo2 {
    public static void main(String[] args) throws Exception {
        //test1();
        test2(); //自动调用close关闭了
    }

    public static void test1() throws IOException {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            fis = new FileInputStream("fis.txt");
            fos = new FileOutputStream("fos.txt",true);
            byte[] bAry  = new byte[1024];
            int len;
            while((len = fis.read(bAry))!=-1) {
                fos.write(bAry, 0, len);
            }
        } finally{
            try{
                if(fis!=null){
                    fis.close();
                    System.out.println("jdk1.7 以前的关闭--fis");
                }
            }finally{
                if(fos!=null){
                    fos.close();
                    System.out.println("jdk1.7 以前的关闭--fos");
                }
            }
        }

    }

    //jdk1.7以后的关闭
    public static void test2() throws Exception {
        try(
                InputStream fis = new FileInputStream("fis.txt");
                OutputStream fos = new FileOutputStream("fos.txt",true);
                MyClose mc = new MyClose();
        ){
            byte[] bAry  = new byte[1024];
            int len;
            while((len = fis.read(bAry))!=-1) {
                fos.write(bAry, 0, len);
            }
        }
    }
}
class MyClose implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("自动调用close关闭了");
    }
}