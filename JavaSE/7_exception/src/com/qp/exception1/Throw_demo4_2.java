package com.qp.exception1;

public class Throw_demo4_2 {
    public static void main(String[] args) throws Exception {  //继续向上抛出异常
        Man2 p = new Man2();
        p.setAge(200);

    }
}

class Man2{
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
