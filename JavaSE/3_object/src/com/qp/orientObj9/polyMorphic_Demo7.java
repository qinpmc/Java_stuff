package com.qp.orientObj9;

public class polyMorphic_Demo7 {
    public static void main(String[] args) {
        F f = new S();
        f.show(); // B

       //method(f);  // 编译出错！！  虽然f 是 new S() 提升来的，但 method(S s)不能直接接收

        S s = (S)f;
        method(s); // B

    }
    public static void method(S s){
        s.show();
    }
}
class F{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("A");
    }
}
class S extends F{
    public void show2(){
        System.out.println("B");
    }
}
