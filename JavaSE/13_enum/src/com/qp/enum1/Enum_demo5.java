package com.qp.enum1;

public class Enum_demo5 {
    public static void main(String[] args) {
        Week w1  = Week.TUE;
        System.out.println(w1.name());      //TUE
        System.out.println(w1.getName());  //星期二
        w1.show();// show:星期二
        switch(w1){
            //case Week.TUE: //错误
            case TUE:
                System.out.println("星期二");
                break;
            case MON:
                System.out.println("星期一");
                break;
            case WEN:
                System.out.println("星期三");
                break;
        }
    }
}
