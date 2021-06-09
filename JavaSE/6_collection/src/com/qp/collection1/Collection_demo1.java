package com.qp.collection1;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        boolean b1 = c.add(1);
        boolean b2 =c.add("String");
        boolean b3 =c.add(true);
        boolean b5 =c.add(1); //可以再添加一个 1
        boolean b6 =c.add(new Demo1());

        System.out.println(c); // [1, String, true, 1, com.qp.collection1.Demo1@4554617c]
        c.remove(1);
        System.out.println(c); // [String, true, 1, com.qp.collection1.Demo1@4554617c]
        c.remove(1);
        System.out.println(c); // [String, true, com.qp.collection1.Demo1@4554617c]

        System.out.println(c.contains(true)); // true
        System.out.println(c.size());  // 3
        System.out.println(c.isEmpty()); // false

/*		ArrayList:
 *      public boolean add(E e) {
		        ensureCapacityInternal(size + 1);  // Increments modCount!!
		        elementData[size++] = e;
		        return true;
		    }*/
    }
}
class Demo1{

}

