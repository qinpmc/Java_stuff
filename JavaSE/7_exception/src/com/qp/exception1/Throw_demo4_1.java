package com.qp.exception1;

public class Throw_demo4_1 {

    public static void main(String[] args) {
        Man p =new Man();
        try {
            p.setAge(200);   //利用try catch 处理setAge 的异常
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
class Man{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {  //此处用 throws 抛出
        if (age>0 && age<130) {
            this.age = age;
        }else{
            throw new Exception("illegal age"); // 抛出编译异常
        }
    }
}

