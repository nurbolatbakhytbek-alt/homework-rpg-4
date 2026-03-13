package com.narxoz.rpg.composite;

public class EnemyUnit extends UnitLeaf {

    public EnemyUnit(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(CombatNode target) {
        System.out.println("Enemy " + name + " attacks " + target.getName());
        target.takeDamage(damage);
    }
}