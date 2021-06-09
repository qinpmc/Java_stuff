package com.qp.collection3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 复杂嵌套
public class Map_demo7 {
    public static void main(String[] args) {
        // 创建总集合
        HashMap<String,HashMap<String,ArrayList<Role>>> roleInfos = new HashMap<>();
        
        // 金庸角色
        HashMap<String,ArrayList<Role>> jinyongRoles = new HashMap<>();

        ArrayList<Role> arrayList1 = new ArrayList<>();
        Role r1  = new Role("令狐冲",21);
        Role r2  = new Role("任盈盈",24);
        arrayList1.add(r1);
        arrayList1.add(r2);

        ArrayList<Role> arrayList2 = new ArrayList<>();
        Role r3  = new Role("郭靖",23);
        Role r4  = new Role("黄蓉",18);
        arrayList2.add(r3);
        arrayList2.add(r4);

        jinyongRoles.put("笑傲江湖",arrayList1);
        jinyongRoles.put("射雕英雄传",arrayList2);

        roleInfos.put("金庸",jinyongRoles);

        // 古龙角色
        HashMap<String,ArrayList<Role>> gulongRoles = new HashMap<>();

        ArrayList<Role> arrayList3 = new ArrayList<>();
        Role r5  = new Role("小鱼儿",21);
        Role r6  = new Role("小仙女",20);
        arrayList3.add(r5);
        arrayList3.add(r6);

        ArrayList<Role> arrayList4 = new ArrayList<>();
        Role r7  = new Role("李寻欢",27);
        Role r8  = new Role("林诗音",23);
        arrayList4.add(r7);
        arrayList4.add(r8);

        gulongRoles.put("绝代双骄",arrayList3);
        gulongRoles.put("小李飞刀",arrayList4);

        roleInfos.put("古龙",gulongRoles);

        // 遍历
        for(Map.Entry<String,HashMap<String,ArrayList<Role>>>  entry : roleInfos.entrySet()){
            String author = entry.getKey();
            HashMap<String,ArrayList<Role>> books = entry.getValue();
            for( Map.Entry<String,ArrayList<Role>> entrySet: books.entrySet()){
                String bookName = entrySet.getKey();
                ArrayList<Role> roles = entrySet.getValue();
                for(Role role : roles){
                    System.out.println(author+" :"+ bookName+": "+role.getName()+"---"+role.getAge());
                }
            }
        }
    }
}

class Role {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }
}