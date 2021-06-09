package com.qp.collection1;

import java.util.LinkedList;
import java.util.Queue;

// Queue--LinkedList
public class Collection_demo12 {
    public static void main(String[] args) {
        Queue<Person> queue1 = new LinkedList<Person>();
        queue1.add(new Person("zs",23));
        queue1.add(new Person("ls",24));

        System.out.println(queue1.element()); //Person [age=23, name=zs],找到表头，不移除,为空时报错
        System.out.println(queue1);// [Person [age=23, name=zs], Person [age=24, name=ls]]

        Queue<Person> queue2 = new LinkedList<Person>();
        //System.out.println(queue2.element()); // 为空时报错 java.util.NoSuchElementException


        queue1.offer(new Person("zl",26)); //offer --加到尾部
        System.out.println(queue1); //  [Person [age=23, name=zs], Person [age=24, name=ls], Person [age=26, name=zl]]

        System.out.println(queue1.poll());   // Person [age=23, name=zs]   poll -- 获取列头，删除，为空时返回null
        System.out.println(queue1.remove()); // Person [age=24, name=ls]   remove -- 获取列头，删除，为空时报错
        System.out.println(queue1); //  [Person [age=26, name=zl]]
        System.out.println(queue1.peek()); //peek -- 查看列头，不删除，为空时返回null

        System.out.println(queue1.poll()); // Person [age=26, name=zl]
        System.out.println(queue1.poll()); //  null   poll -- 获取列头，删除，为空时返回null
        //System.out.println(queue1.remove()); // Person [age=26, name=zl]   remove -- 获取列头，删除，为空时报错 java.util.NoSuchElementException
    }

}
class Person{
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
    public Person(String name,int age) {
        super();
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return p.getName().equals(name) && p.getAge() ==age ;
    }
}

