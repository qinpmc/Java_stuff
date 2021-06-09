package com.qp.file6;

import java.io.*;

public class ObjectOutputStream_demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serilizeObj();
        deserilizeObj();
    }

    //序列化
    public static void serilizeObj() throws IOException {
        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("oos.txt"));
        oos.writeObject(new Person("zs",21));
        oos.writeObject(new Person("ls",22));
        oos.close();
    }

    //反序列化
    public static void deserilizeObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Person p1= (Person) ois.readObject();
        Person p2= (Person) ois.readObject();
        System.out.println(p1);
        System.out.println(p2);

    }
}

//对象必须实现Serializable接口，Serializable为标记接口，没有任何方法
class Person implements Serializable {
    private static final long serialVersionUID = 1L; //id号，修改Person的属性或方法后，也修改下该值，便于追踪
    private String name;
    private int age;
    //private transient int age; //不序列化年龄,年龄默认为0
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
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
}
