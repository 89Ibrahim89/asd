package com.company.players;

import com.company.AbilityType;
import com.company.Hero;

public class Magic extends Hero {
    private AbilityType ability;
    public Magic(int health, int damage, AbilityType ability) {
        super(health, damage, ability);
    }

    @Override
    public void applySuperAbility(Hero heroes) {

    }
}
