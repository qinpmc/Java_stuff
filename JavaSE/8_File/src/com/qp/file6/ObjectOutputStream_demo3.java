package com.qp.file6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStream_demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serilizeObj();
        deserilizeObj();
    }

    //序列化---直接序列化ArrayList
    public static void serilizeObj() throws IOException {
        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("oos2.txt"));
        ArrayList<Person> list  = new ArrayList<>();
        list.add(new Person("zs",99));
        list.add(new Person("ls",98));

        oos.writeObject(list);
        oos.close();
    }

    //反序列化
    public static void deserilizeObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos2.txt"));
        List<Person> listIn = (ArrayList<Person>)ois.readObject();
        System.out.println(listIn.get(0));
        System.out.println(listIn.get(1));
    }
}
