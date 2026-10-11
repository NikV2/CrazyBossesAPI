package me.nik.crazybosses.api.events;

import me.nik.crazybosses.api.custom.Boss;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Map;
import java.util.UUID;

public class BossDeathEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Boss boss;
    private final LivingEntity entity;
    private final Player killer;
    private final Map<UUID, Double> damage;
    private final double maxHealth;

    public BossDeathEvent(Boss boss, LivingEntity entity, Player killer, Map<UUID, Double> damage, double maxHealth) {
        this.boss = boss;
        this.entity = entity;
        this.killer = killer;
        this.damage = damage;
        this.maxHealth = maxHealth;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public Boss getBoss() {
        return boss;
    }

    public LivingEntity getEntity() {
        return entity;
    }

    /**
     * @return The player who landed the killing blow, null if it wasn't a player
     */
    public Player getKiller() {
        return killer;
    }

    /**
     * @return The damage that every player dealt to the boss
     */
    public Map<UUID, Double> getDamage() {
        return damage;
    }

    public double getMaxHealth() {
        return maxHealth;
    }
}
