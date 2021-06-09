package com.qp.collection2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//  TreeSet—比较器排序
public class TreeSet_demo6 {
    public static void main(String[] args) {
        Set<Teacher> set = new TreeSet<Teacher>(new CompareByNameAndAge());
        set.add(new Teacher("az",21));
        set.add(new Teacher("da",22));
        set.add(new Teacher("xa",23));
        set.add(new Teacher("az",24));
        set.add(new Teacher("az",24));
        System.out.println(set);

        System.out.println("az".compareTo("da")); //-3
    }
}
class CompareByNameAndAge implements Comparator<Teacher> {

    @Override
    public int compare(Teacher t1, Teacher t2) {
        int num = t1.getName().compareTo(t2.getName());// 先按照名字排序
        return num==0? t1.getAge()-t2.getAge():num; // 再按照年龄排序

    }

}

class Teacher {
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
        return "Teacher [name=" + name + ", age=" + age + "]";
    }
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
