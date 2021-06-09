package com.qp.enum1;

public enum Color {
    // 枚举类的第一行上必须是枚举项
    RED("红色"),GREEN("绿色"),BLUE("蓝色");
    private String name;
    private Color(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
