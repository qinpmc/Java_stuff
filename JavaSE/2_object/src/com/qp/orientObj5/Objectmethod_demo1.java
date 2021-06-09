package com.qp.orientObj5;

import java.time.LocalDate;


// 方法直接访问Employee 类实例化对象的私有域
public class Objectmethod_demo1 {
    public static void main(String[] args) {
        Employee harry = new Employee("harry",2300,2019,11,21);
        Employee boss = new Employee("harry",5300,2015,2,14);

        System.out.println(harry.equals(boss)); //true
    }
}

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
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

    public boolean equals(Employee e){

        //方法直接访问Employee 类实例化对象的私有域
        return this.name.equals(e.name);
    }
}