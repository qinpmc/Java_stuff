package com.qp.generic;

// 泛型接口
public class Generic_demo2 {
    public static void main(String[] args) {
        InterShowImpl1 interShowImpl1 = new InterShowImpl1();
        interShowImpl1.show("test interShowImpl1"); // test interShowImpl1

        InterShow i21 = new InterShowImpl1();
        //InterShow<String> i21 = new InterShowImpl1(); // 可行，同上句代码
        i21.show("test interShowImpl1"); // test interShowImpl1

        // InterShowImpl1<String> d211 = new InterShowImpl1(); //编译错误！！，InterShowImpl1不需要类型参数，InterShowImpl1不是泛型类了

        InterShowImpl2<Integer> interShowImpl2 = new InterShowImpl2<Integer>(); //指明泛型
        interShowImpl2.show(12);  //12
    }
}
interface InterShow<T>{  // 泛型接口
    public void show(T t);
}


class InterShowImpl1 implements InterShow<String>{  //接口上指明泛型, 类 InterShowImpl1 为非泛型类！！
    @Override
    public void show(String t) {
        System.out.println(t);
    }
}

class InterShowImpl2<T> implements InterShow<T>{  //留到子类定义时指明泛型，ArrayList等集合采用此种方式，InterShowImpl2 为泛型类
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

