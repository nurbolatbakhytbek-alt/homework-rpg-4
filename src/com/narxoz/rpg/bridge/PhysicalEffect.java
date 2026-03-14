package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class PhysicalEffect implements EffectImplementor {
    @Override
    public int computeDamage(int basePower) {
        return Math.max(0, basePower);
    }

    @Override
    public String getEffectName() {
        return "Physical";
    }

    @Override
    public void applyEffect(CombatNode target) {

    }
}
