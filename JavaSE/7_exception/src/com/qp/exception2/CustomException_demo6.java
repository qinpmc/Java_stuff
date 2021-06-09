package com.qp.exception2;

//自定义异常
public class CustomException_demo6 {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(200);
        } catch (MyException e) {

            e.printStackTrace();//MyException: illegal age
        }
    }

}
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MyException {
        if (age>0 && age<150) {
            this.age = age;
        }else{
            throw new MyException("illegal age"); //
        }
    }
}

