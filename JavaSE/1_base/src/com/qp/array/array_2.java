package com.qp.array;
import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter row number:");
        int row = sc.nextInt(); //3

        System.out.println("please enter col number:");
        int col = sc.nextInt(); //5

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i<=2){
                    arr[i][j] = 1;
                }
                if(j==0 || j==i-1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }

                System.out.print(arr[i][j]+" " );
            }
            System.out.println("");

            /*
            1 0 0 0 0
            1 0 0 0 0
            1 1 0 0 0
            */
        }
        System.out.println(arr.length);  // row - -  3
    }
}
