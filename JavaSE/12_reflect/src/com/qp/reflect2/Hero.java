package com.qp.reflect2;

public class Hero {
    public String name;

    //私有的属性
    private int damage;

    public float hp;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public float getHp() {
        return hp;
    }
    public void setHp(float hp) {
        this.hp = hp;
    }
    public Hero(String name, int damage, float hp) {
        super();
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }
    public Hero() {
        super();
    }
    private Hero(String name) {
        super();
        this.name = name;
    }

    public void say() {
        System.out.println("I am a hero");
    }

    private int speak(String name) {
        System.out.println("I am "+name);
        return 1;
    }
    public void attack(Hero h) {
        float hp = (float) h.getHp();
        hp-=10.0;
    }
}
