package com.qp.exception1;

public class Throw_demo4_5 {
    public static void main(String[] args) {
        Man5 p5 =new Man5();
        p5.setAge(200);  //illegal age,调用时没有异常要处理
    }

}
class Man5{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   // 无throws
        if (age>0 && age<150) {
            this.age = age;
        }else{
            try {
                System.out.println("试一试");
            } catch (Exception e) {
                e.printStackTrace();
                // throw e; // 这种做法不用 在方法上使用 throws
                // throw new Exception("illegal age"); // 抛出一个new Exception 的实例，提示必须处理该 新 异常
            }
        }
    }
}

