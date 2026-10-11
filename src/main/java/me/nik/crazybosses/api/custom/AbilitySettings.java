package me.nik.crazybosses.api.custom;

import org.bukkit.entity.EntityType;

import java.util.LinkedHashMap;
import java.util.Map;

public class AbilitySettings {

    private int interval;
    private double radius;
    private int amount;
    private EntityType minionType;

    private final Map<String, Object> options = new LinkedHashMap<>();

    public AbilitySettings(int interval, double radius) {
        this(interval, radius, 1, EntityType.ZOMBIE);
    }

    public AbilitySettings(int interval, double radius, int amount, EntityType minionType) {
        this.interval = interval;
        this.radius = radius;
        this.amount = amount;
        this.minionType = minionType;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public EntityType getMinionType() {
        return minionType;
    }

    public void setMinionType(EntityType minionType) {
        this.minionType = minionType;
    }

    public Map<String, Object> getOptions() {
        return options;
    }

    public void setOption(String key, Object value) {
        options.put(key, value);
    }

    public int getInt(String key, int def) {
        Object value = options.get(key);
        return value instanceof Number ? ((Number) value).intValue() : def;
    }

    public double getDouble(String key, double def) {
        Object value = options.get(key);
        return value instanceof Number ? ((Number) value).doubleValue() : def;
    }

    public boolean getBoolean(String key, boolean def) {
        Object value = options.get(key);
        return value instanceof Boolean ? (Boolean) value : def;
    }

    public String getString(String key, String def) {
        Object value = options.get(key);
        return value == null ? def : String.valueOf(value);
    }
}
