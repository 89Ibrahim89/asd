package com.company;

public abstract class Hero implements IHavingSuperAbility {
    private AbilityType ability;

    public Hero(int health, int damage, AbilityType ability) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
        this.ability = ability;

    }
}