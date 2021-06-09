package com.qp.common2;

public class Reg_demo9 {
    public static void main(String[] args) {
        System.out.println(checkPhoneNum("13912345678"));
        System.out.println(checkEmail("qin@163.com"));
    }

    public static boolean checkPhoneNum(String num){
        //校验以13 或 18 开头的手机号
        return num.matches("1[38][0-9]{9}");
        //return num.matches("1[38]\\d{9}");
    }

    public static boolean checkEmail(String email){
        //校验邮箱
        return email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.com)*(\\.cn)*");
    }

}
