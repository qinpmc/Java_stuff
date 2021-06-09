package com.qp.orientObj10;

//静态内部类
public class InnerClass_demo2 {
    public static void main(String[] args) {
        Out.Inn1 oi = new Out.Inn1();
        oi.show1(); // 20
        oi.show2(); // 20

        Out.Inn2 oi21 = new Out().new Inn2();
        oi21.show1();
        // 10 20
    }

}

class Out{
    private int num = 10;
    private static int num2 =20;
    //静态内部类只能访问静态成员
    static class Inn1{
        public void show1(){ // 静态 内部类的 非静态方法
            //System.out.println(num); //静态内部类只能访问静态成员，num为非静态
            System.out.println(num2);  //num2 为静态
        }
        public static void show2(){   // 静态 内部类的 静态方法
            //System.out.println(num);
            System.out.println(num2);
        }
    }
    class Inn2{
        public void show1(){
            System.out.println(num);
            System.out.println(num2);
        }

        //必须将Inn2声明为static，才能拥有static 方法
/*		public static void show2(){
			System.out.println(num2);
		}*/
    }
}

