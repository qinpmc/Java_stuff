package com.qp.reflect2;

import java.lang.reflect.Field;

public class reflect_demo8 {
    public static void main(String[] args) throws Exception {
        Student s = new Student("zs",23);
        setField(s,"name","lisi");
        System.out.println(s); //Student [name=lisi, age=23]

    }
    public static void setField(Object obj,String propertyName,Object value) throws Exception{
        Class clazz = obj.getClass();
        Field field  = clazz.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj, value);
    }


}
class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

