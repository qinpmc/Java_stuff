package com.qp.exception1;

public class Throw_demo4_4 {
    public static void main(String[] args) {
        Man4 p4 =new Man4();
        p4.setAge(200);  // 无try catch 处理
    }

}
class Man4{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {  // 不用throws
        if (age>0 && age<150) {
            this.age = age;
        }else{
            throw new RuntimeException("illegal age"); // 运行时异常，可不用throws向外抛出
        }
    }
}

