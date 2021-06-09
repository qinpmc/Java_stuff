package com.qp.collection3;

import java.util.HashMap;

// Map的键为自定义对象，为保证键不重复，需重写 hashCode和 equals
public class Map_demo2 {
    public static void main(String[] args) {
        HashMap<Person,String> hm= new HashMap<>();
        hm.put(new Person("zs",23), "shanghai");
        hm.put(new Person("zs",23), "beijing"); // 替换上一行插入的值
        hm.put(new Person("ls",24), "guangzhou");
        hm.put(new Person("ww",25), "shenzhen");
        System.out.println(hm); // {Person [age=23, name=zs]=beijing, Person [age=25, name=ww]=shenzhen, Person [age=24, name=ls]=guangzhou}
    }

}

// idea : alt+insert 重写equals，hashCode
class Person{
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        return result;
    }
}

