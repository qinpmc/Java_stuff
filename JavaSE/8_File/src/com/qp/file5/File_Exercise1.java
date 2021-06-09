package com.qp.file5;

import java.io.*;

//  拷贝文件、文件夹到指定目录
public class File_Exercise1 {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    public static void test1() throws IOException {
        copyFolder(new File("fis.txt"),new File("outputtest"));
    }

    public static void test2() throws IOException {
        copyFolder(new File("inputtest"),new File("outputtest"));
    }

    //拷贝src目录下的文件到des目录或 src文件到des目录
    private static void copyFolder(File src, File dest) throws IOException {
        if(src.isDirectory()){
            File parent = new File(dest,src.getName());
            parent.mkdir();
            File[] files = src.listFiles();
            for(File file :files){
                copyFolder(file,parent);
            }
        }else {
            File newFile = new File(dest,src.getName());
            copyFile(src,newFile);
        }
    }

    private static void copyFile(File src, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] bAry  = new byte[1024];
        int len;
        while((len = bis.read(bAry))!=-1) {
            bos.write(bAry, 0, len);
        }
        System.out.println("copy over.");
        bis.close();
        bos.close();
    }
}
