package me.nik.crazybosses.api.events;

import me.nik.crazybosses.api.custom.Boss;
import me.nik.crazybosses.api.custom.SpawnReason;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BossSpawnedEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Boss boss;
    private final LivingEntity entity;
    private final SpawnReason reason;

    public BossSpawnedEvent(Boss boss, LivingEntity entity, SpawnReason reason) {
        this.boss = boss;
        this.entity = entity;
        this.reason = reason;
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

    public SpawnReason getReason() {
        return reason;
    }
}
