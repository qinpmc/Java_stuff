package com.qp.orientObj5;

import java.time.LocalDate;
// 方法直接访问Employee 类实例化对象的私有域 示例2
public class Objectmethod_demo2 {
    public static void main(String[] args) {
        Person zs = new Person("zs", 1200, 2017, 7,3);

        Manager m = new Manager("zs",1500,2014, 5,2);
        System.out.println(zs.equals(m)); // true

    }
}

class Person{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Person(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public boolean equals(Person e){

        //方法直接访问该 类实例化对象的私有域
        return this.name.equals(e.name);
    }
}

class Manager extends Person{

    public Manager(String name, double salary, int year, int month, int day){
        super(name,salary,year,month,day);
    }

    public boolean equals(Person e){

        //
        //return this.name.equals(e.name); //编译错误
        // return this.getName().equals(e.name); //编译错误
        return this.getName().equals(e.getName());
    }
}