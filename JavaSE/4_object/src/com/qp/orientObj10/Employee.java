package com.qp.orientObj10;

import java.time.LocalDate;

public class Employee {
    private String name;
    protected double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    protected double getSalary() {
        return salary;
    }
    public double getSalary_pbulic() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
}
