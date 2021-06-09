package com.qp.common2;

public class System_demo15 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] des = new int[9];
        System.arraycopy(arr, 1, des, 2, 3);
        for (int i : des) { //des={0,0,2,3,4,0,0,0,0}
            System.out.println(i);
        }
/*      0
        0
        2
        3
        4
        0
        0
        0
        0*/
    }
}
