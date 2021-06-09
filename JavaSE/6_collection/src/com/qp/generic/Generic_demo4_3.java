package com.qp.generic;

// 静态泛型方法
public class Generic_demo4_3 {
    public static void main(String[] args) {
        Gener2 gener2 = new Gener2(13);  //不指定泛型，则是Object
        gener2.print(1); //1
        System.out.println(gener2.show(false));// false
        System.out.println(gener2.show("haha"));// haha

        System.out.println("*****************");
        //
        Gener2<String> gener22 = new Gener2(13);// 指定泛型为 String
        //gener22.print(1); // 编译错误，必须传入String类型参数
        gener22.print("hehe"); // hehe
        // System.out.println(gener22.show(false)); 编译错误，show必须传入String类型参数
        System.out.println(gener22.show("haha"));// haha

        System.out.println("*****************");
        //调用泛型方法,即使gener22 创建时指定泛型为String，但与泛型方法的类型参数无关
        gener22.gericMethod(false); // false
        gener22.gericMethod("haha");// haha

        System.out.println("********静态方法测试*********");
        //静态泛型方法 同 非静态泛型方法，其类型参数与泛型类的类型参数无关
        gener22.staticMd(false); // false
        gener22.staticMd("haha");// haha
        gener22.staticMd2(false);// false
        gener22.staticMd2("haha");// haha
    }
}


class Gener2<T>{ //泛型类
    private int age;
    public void print(T t){   //并非泛型方法，借用类的泛型T
        System.out.println(t);;
    }
    public T show(T t){    //并非泛型方法，借用类的泛型T
        return t;
    }
    public <T> void gericMethod(T t){  //泛型方法,此处的T与泛型类上的T无关，即使同名
        System.out.println(t);
    }
/*	public static void staticMd(T t){  //编译错误，与类的泛型符号T相同，静态方法不能借用类的泛型T

	}*/

    /*    public static void staticMd3(Q q){  //编译错误与类的泛型符号T不同，语法错误，应声明泛型Q


        }*/
    public static<T> void staticMd(T t){  //泛型静态方法，注意，此处T也并非泛型类的T
        System.out.println(t);
    }
    public static<Q> void staticMd2(Q q){ //泛型静态方法
        System.out.println(q);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Gener2(int age) {
        this.age = age;
    }
}