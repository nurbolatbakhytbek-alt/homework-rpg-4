package com.narxoz.rpg;

import com.narxoz.rpg.composite.*;
import com.narxoz.rpg.bridge.*;
import com.narxoz.rpg.battle.*;

public class Main {

    public static void main(String[] args) {

        HeroUnit knight = new HeroUnit("Knight", 100, 20);
        HeroUnit mage = new HeroUnit("Mage", 80, 25);

        EnemyUnit orc = new EnemyUnit("Orc", 90, 15);
        EnemyUnit goblin = new EnemyUnit("Goblin", 70, 10);

        PartyComposite heroes = new PartyComposite("Heroes");
        heroes.addMember(knight);
        heroes.addMember(mage);

        PartyComposite enemies = new PartyComposite("Enemies");
        enemies.addMember(orc);
        enemies.addMember(goblin);

        Skill fireSkill = new SingleTargetSkill(new FireEffect());
        Skill iceSkill = new AreaSkill(new IceEffect());

        fireSkill.use(orc);
        iceSkill.use(knight);

        RaidEngine engine = new RaidEngine();
        engine.startRaid(heroes, enemies);
    }
}