package com.geektech;

public class Hero {
    private int health;
    private int damage;
    private String name;


    public Hero(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
