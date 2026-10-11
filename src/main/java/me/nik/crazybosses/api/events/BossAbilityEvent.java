package me.nik.crazybosses.api.events;

import me.nik.crazybosses.api.custom.AbilityType;
import me.nik.crazybosses.api.custom.Boss;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class BossAbilityEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Boss boss;
    private final LivingEntity entity;
    private final AbilityType ability;
    private final List<Player> targets;
    private boolean cancel = false;

    public BossAbilityEvent(Boss boss, LivingEntity entity, AbilityType ability, List<Player> targets) {
        this.boss = boss;
        this.entity = entity;
        this.ability = ability;
        this.targets = targets;
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

    public AbilityType getAbility() {
        return ability;
    }

    public List<Player> getTargets() {
        return targets;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
