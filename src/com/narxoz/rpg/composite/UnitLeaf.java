package com.narxoz.rpg.composite;

import java.util.List;

public class UnitLeaf implements CombatNode {

    protected String name;
    protected int health;
    protected int damage;

    public UnitLeaf(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return 0;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public List<CombatNode> getChildren() {
        return List.of();
    }

    @Override
    public void printTree(String indent) {

    }

    @Override
    public void attack(CombatNode target) {
        System.out.println(name + " attacks " + target.getName());
        target.takeDamage(damage);
    }
}