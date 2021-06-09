package com.qp.orientObj10;

import com.qp.orientObj11.Manager;

public class Protected_demo0 {

    public static void main(String[] args) {
        Manager boss = new Manager("jack", 20000, 2000, 1, 1);
        Employee employee = new Employee("fan", 1500, 2012, 12, 12);
        System.out.println(boss.compare(employee));

    }
}




