package com.narxoz.rpg.composite;

public class HeroUnit extends UnitLeaf {

    public HeroUnit(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(CombatNode target) {
        System.out.println("Hero " + name + " strikes " + target.getName());
        target.takeDamage(damage);
    }
}