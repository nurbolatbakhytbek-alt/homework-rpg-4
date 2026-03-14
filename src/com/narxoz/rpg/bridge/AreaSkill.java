package com.narxoz.rpg.bridge;

import com.narxoz.rpg.composite.CombatNode;

public class AreaSkill extends Skill {

    public AreaSkill(EffectImplementor effect) {
        super(effect);
    }

    @Override
    public void use(CombatNode target) {
        System.out.println("Area skill activated!");
        effect.applyEffect(target);
    }
}