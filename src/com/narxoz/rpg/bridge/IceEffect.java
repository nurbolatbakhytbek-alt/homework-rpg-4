package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class IceEffect implements EffectImplementor {

    @Override
    public int computeDamage(int basePower) {
        return 0;
    }

    @Override
    public String getEffectName() {
        return "";
    }

    @Override
    public void applyEffect(CombatNode target) {
        System.out.println(target.getName() + " is frozen!");
        target.takeDamage(10);
    }
}