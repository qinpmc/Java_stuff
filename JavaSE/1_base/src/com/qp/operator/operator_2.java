package com.qp.operator;

public class operator_2 {
    public static void main(String[] args) {
        int i1 = 10 / 3;
        System.out.println(i1);  //3

        float i2 = (float) (10 / 3.0);
        System.out.println(i2);  //3.3333

        int i3 = 10 % (-3);
        System.out.println(i3); //1

        int i4 = -10 % (3);
        System.out.println(i4); //-1

        int x = 4;
        // 4 +  (4+1-->5,++5 -->6) +  6*10-->60
        int y = (x++) + (++x) + (x * 10);
        System.out.println(y);  //70
    }
}
