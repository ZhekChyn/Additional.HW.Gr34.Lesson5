package com.geektech;

public class Main {

    public static void main(String[] args) {

        for (Hero heroes: createHeroes()) {
            System.out.println(heroes.getName() + " : health = " + heroes.getHealth() + " | damage = " + heroes.getDamage());
        }
    }

    public static Hero[] createHeroes () {
        Hero Marat = new Hero("Marat",600, 250);
        Hero Aidar = new Hero("Aidar",550, 125);
        Hero Zhyrgal = new Hero("Zhyrgal",500, 120);

        Hero[] heroes = {Marat, Aidar, Zhyrgal};
        return heroes;
    }




}

