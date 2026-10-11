package me.nik.crazybosses.api;

import me.nik.crazybosses.api.custom.AbilityType;
import me.nik.crazybosses.api.custom.Boss;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface CrazyBossesAPI {

    /**
     * Register a boss
     * Registered bosses are not saved to the bosses folder, register them again every time your plugin enables
     *
     * @param boss The boss
     */
    void registerBoss(Boss... boss);

    /**
     * Register an ability
     * Bosses can use it by having its name inside their abilities
     *
     * @param ability The ability
     */
    void registerAbility(AbilityType... ability);

    /**
     * Unregister a boss that was registered through the api
     *
     * @param id The id of the boss
     * @return true if the boss was registered through the api and has been removed
     */
    boolean unregisterBoss(String id);

    /**
     * @param id The id of the boss
     * @return The boss, null if there isn't one with that id
     */
    Boss getBoss(String id);

    /**
     * @return Every loaded boss
     */
    Collection<Boss> getBosses();

    /**
     * Spawn a boss, this skips the spawning limits of the config but fires the spawn events
     *
     * @param boss     The boss
     * @param location The location
     * @return The spawned entity, null if it was cancelled or couldn't be spawned
     */
    LivingEntity spawnBoss(Boss boss, Location location);

    /**
     * @param entity The entity
     * @return true if the entity is a boss
     */
    boolean isBoss(Entity entity);

    /**
     * @param entity The entity
     * @return The boss of the entity, null if it isn't a boss
     */
    Boss getBoss(Entity entity);

    /**
     * @return The bosses that are currently alive
     */
    Collection<LivingEntity> getActiveBosses();

    /**
     * Create a boss egg
     *
     * @param boss   The boss
     * @param amount The amount
     * @return The boss egg
     */
    ItemStack createEgg(Boss boss, int amount);
}
