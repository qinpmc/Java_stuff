package com.qp.common;

public class Object_api_demo_1 {

    public static void main(String[] args) {
        Person p =new Person("zhangsan");
        System.out.println(p.hashCode()); //1163157884
        Class clazz = p.getClass();
        String className = clazz.getName();
        System.out.println(className); //com.qp.common.Person
        System.out.println(p.toString()); //com.qp.common.Person@4554617c
    }

}
class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        super();
        this.name = name;
    }

}


