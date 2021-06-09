package com.qp.reflect1;

public class Hero {
    public String name;
    private float hp;
    private int damage;
    private int id;

    static String copyright;

    static {
        System.out.println("初始化 Hero");
        copyright = "版权由 Games公司所有";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void magicAttack(){

    }

    public void call(Hero h){
        System.out.println("call Hero");
    }

    public void call(APHero h){
        System.out.println("call APHero");
    }

    public void call(String name){
        System.out.println("call "+ name);
    }
}