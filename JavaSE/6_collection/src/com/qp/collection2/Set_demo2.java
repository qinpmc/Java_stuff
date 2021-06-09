package com.qp.collection2;

import java.util.HashSet;
import java.util.Set;

// HashSet
public class Set_demo2 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("qq1",21));
        set.add(new Person("qq1",21)); // 不会添加成功
        set.add(new Person("qq2",22));
        System.out.println(set); // [Person [name=qq1, age=21], Person [name=qq2, age=22]]
    }
}

class Person{
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
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // idea： alt + insert 重写 equals ，hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

