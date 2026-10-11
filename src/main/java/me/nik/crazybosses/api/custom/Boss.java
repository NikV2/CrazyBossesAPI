package me.nik.crazybosses.api.custom;

import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Boss {

    public static final EquipmentSlot[] EQUIPMENT_SLOTS = new EquipmentSlot[]{
            EquipmentSlot.HEAD,
            EquipmentSlot.CHEST,
            EquipmentSlot.LEGS,
            EquipmentSlot.FEET,
            EquipmentSlot.HAND,
            EquipmentSlot.OFF_HAND
    };

    private final String id;

    private String displayName = "&cNew Boss";
    private EntityType entityType = EntityType.ZOMBIE;

    private double health = 200.0;
    private double damage = 6.0;
    private double speed = 0.25;
    private double armor = 0.0;
    private double knockbackResistance = 0.0;
    private double followRange = 40.0;
    private boolean glowing = false;

    private boolean bossBarEnabled = true;
    private BarColor bossBarColor = BarColor.RED;
    private BarStyle bossBarStyle = BarStyle.SEGMENTED_10;
    private double bossBarRadius = 60.0;

    private final Map<EquipmentSlot, ItemStack> equipment = new EnumMap<>(EquipmentSlot.class);

    private boolean vanillaDrops = false;
    private int xp = 0;

    private final Map<String, AbilitySettings> abilities = new LinkedHashMap<>();

    private double minDamagePercent = 1.0;
    private final List<String> commands = new ArrayList<>();
    private final List<RewardItem> items = new ArrayList<>();
    private final List<String> topDamagerCommands = new ArrayList<>();
    private final List<String> lastHitCommands = new ArrayList<>();

    public Boss(String id) {
        this.id = id.toLowerCase();
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getKnockbackResistance() {
        return knockbackResistance;
    }

    public void setKnockbackResistance(double knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
    }

    public double getFollowRange() {
        return followRange;
    }

    public void setFollowRange(double followRange) {
        this.followRange = followRange;
    }

    public boolean isGlowing() {
        return glowing;
    }

    public void setGlowing(boolean glowing) {
        this.glowing = glowing;
    }

    public boolean isBossBarEnabled() {
        return bossBarEnabled;
    }

    public void setBossBarEnabled(boolean bossBarEnabled) {
        this.bossBarEnabled = bossBarEnabled;
    }

    public BarColor getBossBarColor() {
        return bossBarColor;
    }

    public void setBossBarColor(BarColor bossBarColor) {
        this.bossBarColor = bossBarColor;
    }

    public BarStyle getBossBarStyle() {
        return bossBarStyle;
    }

    public void setBossBarStyle(BarStyle bossBarStyle) {
        this.bossBarStyle = bossBarStyle;
    }

    public double getBossBarRadius() {
        return bossBarRadius;
    }

    public void setBossBarRadius(double bossBarRadius) {
        this.bossBarRadius = bossBarRadius;
    }

    public Map<EquipmentSlot, ItemStack> getEquipment() {
        return equipment;
    }

    public boolean isVanillaDrops() {
        return vanillaDrops;
    }

    public void setVanillaDrops(boolean vanillaDrops) {
        this.vanillaDrops = vanillaDrops;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * @return The abilities of the boss, the key is the name of the ability
     */
    public Map<String, AbilitySettings> getAbilities() {
        return abilities;
    }

    public void addAbility(AbilityType ability) {
        abilities.put(ability.getName(), ability.createDefaults());
    }

    public void addAbility(AbilityType ability, AbilitySettings settings) {
        abilities.put(ability.getName(), settings);
    }

    public double getMinDamagePercent() {
        return minDamagePercent;
    }

    public void setMinDamagePercent(double minDamagePercent) {
        this.minDamagePercent = minDamagePercent;
    }

    /**
     * @return The reward commands, each one may start with a chance like [50]
     */
    public List<String> getCommands() {
        return commands;
    }

    public List<RewardItem> getItems() {
        return items;
    }

    public List<String> getTopDamagerCommands() {
        return topDamagerCommands;
    }

    public List<String> getLastHitCommands() {
        return lastHitCommands;
    }
}
