package com.qp.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//   Collections -自定义比较器
public class Collections_demo9 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",21));
        list.add(new Student("wangwu",23));
        list.add(new Student("lisi",22));
        list.add(new Student("zhangsan",21));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //int num = o2.getAge() - o1.getAge(); // 按照年龄从大大小
                int num = o1.getAge() - o2.getAge(); // 按照年龄从小到大
                int num2 = num==0? o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        System.out.println(list);
    }
}

class Student  {
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
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}