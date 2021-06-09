package com.qp.generic;

// 泛型类
public class Generic_demo1 {
    public static void main(String[] args) {
        ObjectTool<String> objectTool1 = new ObjectTool<>();
        objectTool1.setObj("haha");
        System.out.println(objectTool1.getObj()); // haha

        ObjectTool<Boolean> objectTool2 = new ObjectTool<>();
        objectTool2.setObj(true);
        System.out.println(objectTool1.getObj()); // true

        ObjectTool<Integer> objectTool3 = new ObjectTool<>();
        // objectTool3.setObj(1.0); // 编译报错  setObj 的参数类型（此处为Double）和泛型类 参数类型（此处为Integer）相同才行

    }

}

class ObjectTool<T>{
    private T obj;
    public T getObj(){
        return obj;
    }
    public void setObj(T obj){
        this.obj = obj;
    }
}