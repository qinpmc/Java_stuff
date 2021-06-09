package com.qp.orientObj10;

//  匿名内部类 -- 成员方法返回匿名类
public class InnerClass_demo9 {
    public static void main(String[] args) {

        Outert.method().show(); //hello world

        Outert2.method().show(); //hello world

    }
}
interface Intert { void show(); }

class Outert{
	public static Intert method(){
		class Innert implements Intert{
			public void show() {
				System.out.println("hello world");
			}
		}
		return new Innert();
	}
}

// 等价上方实现
class Outert2{
    public static Intert method(){
        return new Intert(){
            public void show() {
                System.out.println("hello world");
            }
        };
    }
}

