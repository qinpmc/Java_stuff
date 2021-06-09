package com.qp.exception1;

public class Finally_demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
            return;  //仍会执行finally
            //System.exit(0); // 加上此句finally不执行
        }finally{
            System.out.println("------finally----"); //仍会执行
        }
    }
}

