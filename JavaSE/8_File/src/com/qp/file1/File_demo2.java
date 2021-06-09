package com.qp.file1;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class File_demo2 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\books";
        File f1 = new File(path);

        LinkedList<String> ll  =new LinkedList<>();
        getPdfFile(f1,ll);
        System.out.println(ll);

    }

    public  static  void  test1(){

    }
    public  static  void  test2(){


    }

    public static void getPdfFile(File f, LinkedList<String> ll){
        File[] fileAry = f.listFiles();
        if(fileAry!=null){ //隐藏文件
            for (File file : fileAry) {
                if(!file.isDirectory()){
                    String name = file.getName();
                    if(name.endsWith(".pdf")){
                        ll.add(file.getAbsolutePath());
                    }
                }else{
                    getPdfFile(file,ll);
                }
            }
        }
    }



}
