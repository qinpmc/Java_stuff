package com.qp.file7;

import java.io.File;
import java.util.LinkedList;

public class Test_demo4 {
    public static void main(String[] args) {
        //统计文件夹的大小
        File file =new File("1_base");
        System.out.println(getFileSize(file));
        long init = 0;
        System.out.println(getFileSize2(new File("1_base"),init));

        String path = "C:\\Users\\pony";
        File f1 = new File(path);
        System.out.println(f1.isDirectory());

        LinkedList<String> ll  =new LinkedList<String>();
        getPdfFile(f1,ll);
        System.out.println(ll);

        LinkedList<String> ll2 = getPdfFile2(f1);
        System.out.println(ll2);


    }
    public static long getFileSize(File file){
        long sumSize = 0;
        File[] fileAry = file.listFiles();
        if(fileAry!=null){
            for (int i = 0; i < fileAry.length; i++) {
                if(fileAry[i].isFile()){
                    sumSize+=fileAry[i].length();
                }else{
                    sumSize+=getFileSize(fileAry[i]);
                }
            }
        }
        return sumSize;
    }


    public static long getFileSize2(File file,long sumSize){ //错误的写法

        File[] fileAry = file.listFiles();
        if(fileAry!=null){
            for (int i = 0; i < fileAry.length; i++) {
                if(fileAry[i].isFile()){
                    sumSize+=fileAry[i].length();
                }else{
                    sumSize+=getFileSize2(fileAry[i],sumSize);
                }
            }
        }
        return sumSize;
    }


    public static void getPdfFile(File f,LinkedList<String> ll){
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

    public static LinkedList<String> getPdfFile2(File f){  //错误的写法
        LinkedList<String> ll = new LinkedList<String>();
        File[] fileAry = f.listFiles();
        if(fileAry!=null){ //隐藏文件
            for (File file : fileAry) {
                if(!file.isDirectory()){
                    String name = file.getName();
                    if(name.endsWith(".pdf")){
                        ll.add(file.getAbsolutePath());
                    }
                }else{
                    ll= getPdfFile2(file);
                }
            }
        }
        return ll;
    }

}
