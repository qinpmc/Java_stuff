package com.qp.common2;

import java.util.Arrays;

public class Arrays_demo5 {
    public static void main(String[] args) {
        int[] arr = {23,7,5,32,73,31,3};
        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index); //1
    }
}
