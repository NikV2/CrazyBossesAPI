package me.nik.crazybosses.api.events;

import me.nik.crazybosses.api.custom.Boss;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BossDamageEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Boss boss;
    private final LivingEntity entity;
    private final Player player;
    private double damage;
    private boolean cancel = false;

    public BossDamageEvent(Boss boss, LivingEntity entity, Player player, double damage) {
        this.boss = boss;
        this.entity = entity;
        this.player = player;
        this.damage = damage;
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

    public Player getPlayer() {
        return player;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
