package com.how2java.pojo;

import org.springframework.stereotype.Component;

//@Component("c")
public class Category {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int id;
    //private String name = "文具";
    private String name = "文具";
    private String aliasName;


    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }
}
