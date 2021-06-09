package com.qp.orientObj3;


// static 示例
public class Static_demo1 {
    public static void main(String[] args) {
        int[] arr = {12,25,6,33,62,57};
        int max = ArrayTool.getMax(arr);
        System.out.println(max); //62

        ArrayTool.revArray(arr);
        for(int index=0,length=arr.length;index<length;index++){
            System.out.print(arr[index]+" ");
        }

    }
}


 class ArrayTool {
    //如果一个类中所有的方法都是静态的, 则私有构造方法,目的是不让其他类创建本类对象
    private ArrayTool(){}

    //1,获取最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1;i < arr.length ;i++ ) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    //2,数组的反转
    public static void revArray(int[] arr) {
        for (int i = 0;i < arr.length / 2 ;i++ ) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
