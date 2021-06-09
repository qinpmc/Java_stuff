package com.qp.common;


import java.util.Date;

// clone --- 示例
public class Object_clone_demo_2_2 implements Cloneable {
    public static void main(String[] args) {
        Employee e1 = new Employee("fan", 1500, 2012, 12, 12);
        Employee e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(e2.getHireDay());

    }
}

class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        e.hireDay = (Date) hireDay.clone();
        return e;
    }
}

