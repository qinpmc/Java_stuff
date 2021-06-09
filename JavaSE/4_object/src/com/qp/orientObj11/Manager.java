package com.qp.orientObj11;

import com.qp.orientObj10.Employee;

public class Manager extends Employee {
    public double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    ////方法重写
    public double getSalary() {
        //double baseSalary = salary+bonus; //编译错误，salary从Employee继承，但是是私有属性，无法直接访问
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public double compare(Employee e) {
        //double salary = e.salary;// 编译错误， 不在同一个包下，父类的protected 属性，子类无法访问
        //double salary = e.getSalary();
        double salary = e.getSalary_pbulic();
        double bonus = this.getSalary();
        return bonus - salary;
    }
}
