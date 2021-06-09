package com.qp.function1;

import java.util.function.Function;

public class FunctionTest1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i*4;   // lambda
        System.out.println(f1.apply(3));

        Function<Integer, Integer> f2 = i -> i+4;   // lambda
        System.out.println(f2.apply(3));

        Function<String, Integer> f3 = s -> s.length();   // lambda
        System.out.println(f3.apply("Adithya"));

        System.out.println(f2.compose(f1).apply(3));
        System.out.println(f2.andThen(f1).apply(3));

        System.out.println(Function.identity().apply(10));
        System.out.println(Function.identity().apply("Adithya"));
    }
}

/*
    default <V> Function<T,V>	andThen(Function<? super R,? extends V> after)
    Returns a composed function that first applies this function to its input, and then applies the after function to the result.

     R	apply(T t)   Applies this function to the given argument.

     default <V> Function<V,R>	compose(Function<? super V,? extends T> before)
        Returns a composed function that first applies the before function to its input, and then applies this function to the result.

    static <T> Function<T,T>	identity()
        Returns a function that always returns its input argument.
*/