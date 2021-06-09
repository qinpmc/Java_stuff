package com.qp.generic;

// 参数化类型
public class Generic_demo5 {
    public static void main(String[] args) {
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");

        // 泛型类的类型参数可以用参数化类型替换
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(99));
        System.out.println(p.getKey()); // primes
        System.out.println(p.getValue().get()); // 99
    }
}


interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
  class Box<T> {
    // T stands for "Type"
    private T t;

    public Box(T t){
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}