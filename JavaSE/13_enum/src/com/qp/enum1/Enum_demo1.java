package com.qp.enum1;

public class Enum_demo1 {
    public static void main(String[] args) {
        Direction direction1 = Direction.FRONT;
        System.out.println(direction1.getName()); //FRONT
    }
}

class Direction{
    public static final Direction FRONT = new Direction("FRONT");
    public static final Direction BACK = new Direction("BACK");
    public static final Direction LEFT = new Direction("LEFT");
    public static final Direction RIGHT = new Direction("RIGHT");

    private String name;

    private Direction(String name){   //私有构造
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
