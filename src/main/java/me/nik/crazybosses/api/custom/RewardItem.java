package me.nik.crazybosses.api.custom;

import org.bukkit.inventory.ItemStack;

public class RewardItem {

    private double chance;
    private final ItemStack item;

    public RewardItem(double chance, ItemStack item) {
        this.chance = chance;
        this.item = item;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    public ItemStack getItem() {
        return item;
    }
}
