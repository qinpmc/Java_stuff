package com.qp.orientObj8;

// 	方法覆写时从private变为default不算方法覆写
public class MethodRewrite3 {

    public static void main(String[] args) {
        St s1 = new St();
        s1.fun(); //Pe,并未输出St；类 Pe的 print方法改为非 private修饰符，即均输出St


        ///////////
        Pe p1 = new Pe();
        p1.fun(); //Pe

    }
}

class Pe{

    // 此处 private 去掉，改为 public，protected，或默认，均输出St
    private void print(){
        System.out.println("Pe");
    }

    public void fun(){
        this.print();
        System.out.println(this instanceof St);
    }
}

class St extends Pe{
     public void print(){
        System.out.println("St");
    }
}

