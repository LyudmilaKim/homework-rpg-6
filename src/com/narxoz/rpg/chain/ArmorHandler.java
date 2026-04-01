package com.narxoz.rpg.chain;

import com.narxoz.rpg.arena.ArenaFighter;

public class ArmorHandler extends DefenseHandler {
    private final int armorValue;

    public ArmorHandler(int armorValue) {
        this.armorValue = armorValue;
    }

    @Override
    public void handle(int incomingDamage, ArenaFighter target) {
        int absorbed = Math.min(incomingDamage, armorValue);
        int remainder = incomingDamage - absorbed;
        System.out.println("[Armor] Armor absorbed " + absorbed + " damage, remaining " + remainder);
        passToNext(remainder, target);
    }
}