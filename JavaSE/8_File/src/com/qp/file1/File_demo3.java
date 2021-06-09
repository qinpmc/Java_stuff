package com.qp.file1;

import java.io.File;
import java.io.FilenameFilter;

//FilenameFilter
public class File_demo3 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users");
        String[] strAry = f1.list(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                File f = new File(dir,name);
                return f.isFile() && f.getName().endsWith(".pdf");
            }

        });
        for (String str : strAry) {
            System.out.println(str);
        }

    }
}
