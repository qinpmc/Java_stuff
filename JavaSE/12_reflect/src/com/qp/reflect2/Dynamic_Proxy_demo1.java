package com.qp.reflect2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dynamic_Proxy_demo1 {
    public static void main(String[] args) {
        test1();
        System.out.println("---------------");

        //必须是IUser，不能是User
        IUser user2 = (IUser) Proxy.newProxyInstance(User.class.getClassLoader(),User.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("权限校验");
                        //method.invoke(obj, args);
                        return null;
                    }
                });
        user2.add(); //权限校验
    }

    public static void test1(){
        User u = new User();
        MyInvocationHandler mh = new MyInvocationHandler(u);

        //必须是IUser接口，不能是User
        IUser user = (IUser) Proxy.newProxyInstance(u.getClass().getClassLoader(), u.getClass().getInterfaces(), mh);
        user.add(); //权限校验          add user
    }
}


class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        Object obj = method.invoke(target, args);
        return obj;
    }
}

interface IUser {
    void add();
    void delete();
}

class User implements IUser {
    @Override
    public void add() {
        System.out.println("add user");
    }

    @Override
    public void delete() {
        System.out.println("delete user");
    }
}
