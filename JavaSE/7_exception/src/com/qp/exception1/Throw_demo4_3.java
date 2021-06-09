package com.qp.exception1;

public class Throw_demo4_3 {
    public static void main(String[] args) {
        Man3 p3 =new Man3();
        p3.setAge(200);  //illegal age,调用时没有异常要处理
    }

}
class Man3{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   // 无throws
        if (age>0 && age<150) {
            this.age = age;
        }else{
            try {
                throw new Exception("illegal age"); //自己处理异常
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

