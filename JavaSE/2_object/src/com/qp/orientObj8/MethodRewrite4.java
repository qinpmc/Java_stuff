package com.qp.orientObj8;

import java.time.LocalDate;

public class MethodRewrite4 {

    public static void main(String[] args) {
        Manager boss = new Manager("jack",20000,2000,1,1);
        Employee employee = new Employee("fan",1500,2012,12,12);

        System.out.println(boss instanceof Manager);  //true
        System.out.println(boss  instanceof Employee);//true

        System.out.println(employee instanceof Manager);//false
        System.out.println(employee  instanceof Employee); //true
    }


}
class Employee {
    private String name;
    private double salary;
    private LocalDate  hireDay;

    public Employee(String name,double salary,int year,int month,int day){
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
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus = 0;
    }

    ////方法重写
    public double getSalary(){
        //double baseSalary = salary+bonus; //编译错误，salary从Employee继承，但是是私有属性，无法直接访问
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}



