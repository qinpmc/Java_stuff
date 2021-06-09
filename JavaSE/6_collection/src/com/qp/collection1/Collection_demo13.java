package com.qp.collection1;

import java.util.Deque;
import java.util.LinkedList;

// DeQue--LinkedList
public class Collection_demo13 {
    public static void main(String[] args) {
        Deque<Person> queue1 = new LinkedList<Person>();
        queue1.add(new Person("zs",23));
        queue1.add(new Person("ls",24));

        queue1.push(new Person("zl",26));
        System.out.println(queue1); //[Person [age=26, name=zl], Person [age=23, name=zs], Person [age=24, name=ls]]

        System.out.println(queue1.pop()); // Person [age=26, name=zl]
        System.out.println(queue1); // [Person [age=23, name=zs], Person [age=24, name=ls]]

        queue1.removeFirst();
        queue1.addFirst(new Person("zl",27));
        System.out.println(queue1); //[Person [age=27, name=zl], Person [age=24, name=ls]]

        System.out.println(queue1.getFirst()); // Person [age=27, name=zl]
        System.out.println(queue1.getLast()); // Person [age=24, name=ls]

        System.out.println();
    }
}
