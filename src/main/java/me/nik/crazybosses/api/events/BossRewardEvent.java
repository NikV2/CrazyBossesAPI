package me.nik.crazybosses.api.events;

import me.nik.crazybosses.api.custom.Boss;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BossRewardEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Boss boss;
    private final Player player;
    private final double damage;
    private final double percent;
    private final int rank;
    private boolean cancel = false;

    public BossRewardEvent(Boss boss, Player player, double damage, double percent, int rank) {
        this.boss = boss;
        this.player = player;
        this.damage = damage;
        this.percent = percent;
        this.rank = rank;
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

    public Player getPlayer() {
        return player;
    }

    public double getDamage() {
        return damage;
    }

    /**
     * @return The percent of the boss' health that the player dealt
     */
    public double getPercent() {
        return percent;
    }

    /**
     * @return The position of the player in the damage ranking, 1 is the top damager
     */
    public int getRank() {
        return rank;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
