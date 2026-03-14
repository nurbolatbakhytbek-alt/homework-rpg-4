package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class FireEffect implements EffectImplementor {

    @Override
    public void applyEffect(CombatNode target) {
        System.out.println(target.getName() + " is burned!");
        target.takeDamage(15);
    }
}