package com.qp.common;


// equals --- 示例
public class Object_equals_demo_2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",21);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("lisi",21);

        System.out.println(s1.equals(s2)); // false
        System.out.println(s2.equals(s3)); // true

        MaleStudent male = new MaleStudent("zhangsan",21);
        System.out.println(s1.equals(male)); // false  --- s1 和 male 不是一个类

    }
}

class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name,int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        if(!(obj instanceof Student)) return false;
        Student student = (Student)obj;
        return name == student.name && age == student.age;
    }
}

class MaleStudent extends Student{
    public MaleStudent(String name,int age) {
        super(name,age);
    }
}