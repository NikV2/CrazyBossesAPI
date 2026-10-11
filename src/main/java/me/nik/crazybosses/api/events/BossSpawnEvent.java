package me.nik.crazybosses.api.events;

import me.nik.crazybosses.api.custom.Boss;
import me.nik.crazybosses.api.custom.SpawnReason;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BossSpawnEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final Boss boss;
    private final SpawnReason reason;
    private final Player player;
    private Location location;
    private boolean cancel = false;

    public BossSpawnEvent(Boss boss, Location location, SpawnReason reason, Player player) {
        this.boss = boss;
        this.location = location;
        this.reason = reason;
        this.player = player;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public SpawnReason getReason() {
        return reason;
    }

    /**
     * @return The player who caused the spawn, null if it wasn't a player
     */
    public Player getPlayer() {
        return player;
    }

    public boolean isCancelled() {
        return this.cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
