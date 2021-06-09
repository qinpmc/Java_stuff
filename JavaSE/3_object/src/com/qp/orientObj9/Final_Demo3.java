package com.qp.orientObj9;


// final 类 域可以修改，final 类的方法自动成为final
public class Final_Demo3 {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.price = 2222; //final 类 域可以修改
        System.out.println(machine.price);
    }
}

final class Machine {
    double price = 1234;
    public Object work(){
        return new Object();
    }
}

/*
//编译失败
class PrintMachine extends Machine{

}
*/
