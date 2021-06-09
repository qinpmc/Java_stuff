package com.qp.exception2;

public class Exception_demo7 {
    public static void main(String[] args) {
        Math m = new Math();
        m.div(10, 0); // java.lang.ArithmeticException: / by zero
    }

}
class Math{
    public int div(int i,int j){ //  没有throws
        int tmp = 0;
        try{
            tmp = i/j;
        }catch(Exception e){
            throw e;
            //System.out.println("不执行"); //编译错误，该代码不可达
        }
        return tmp;
    }
}

