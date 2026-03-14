package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class SingleTargetSkill extends Skill {

    public SingleTargetSkill(EffectImplementor effect) {
        super(effect);
    }

    @Override
    public void use(CombatNode target) {
        System.out.println("Single target skill used!");
        effect.applyEffect(target);
    }
}