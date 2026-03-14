package com.narxoz.rpg.composite;

import java.util.ArrayList;
import java.util.List;

public class PartyComposite implements CombatNode {

    private String name;
    private List<CombatNode> members = new ArrayList<>();

    public PartyComposite(String name) {
        this.name = name;
    }

    public void addMember(CombatNode node) {
        members.add(node);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        int total = 0;
        for (CombatNode node : members) {
            total += node.getHealth();
        }
        return total;
    }

    @Override
    public int getAttackPower() {
        return 0;
    }

    @Override
    public void takeDamage(int damage) {
        for (CombatNode node : members) {
            if (node.isAlive()) {
                node.takeDamage(damage);
                break;
            }
        }
    }

    @Override
    public boolean isAlive() {
        for (CombatNode node : members) {
            if (node.isAlive()) return true;
        }
        return false;
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
        for (CombatNode node : members) {
            if (node.isAlive()) {
                node.attack(target);
            }
        }
    }
}