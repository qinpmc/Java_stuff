package com.qp.orientObj9;

import java.time.LocalDate;

// 数组中的多态问题 示例
public class polyMorphic_Demo8 {
    public static void main(String[] args) {

        // 示例情况1

        /*
        Manager boss = new Manager("Bob",500,2011,3,21);
        Employee[] staff = new Employee[3];

        staff[0] = boss; // staff Employee数组 存储 子类Manager 实例对象
        boss.setBonus(999);
        //staff[0].setBonus(999); //编译失败, staff 数组是 Employee数组，没有setBonus方法
        */

        // 示例情况2
        Manager[] bosses = new Manager[5];
        Employee[] staff = bosses;

        bosses[0] = new Manager("Bob",500,2011,3,21);
        //bosses[1] = new Employee("Bob",500,2011,3,21); //编译失败--类型不兼容

        staff[1]  =  new Employee("Jack",600,2015,7,3);//编译不报错，运行报错java.lang.ArrayStoreException

        //staff[1].setBonus(777); //编译失败
        bosses[1].setBonus(777);
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
}

class Manager extends Employee{

    private double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super( name,salary,year,month,day);
        bonus = 0;
    }

    public void setBonus(double b){
        bonus = b;
    }

}