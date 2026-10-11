package me.nik.crazybosses.api.custom;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public abstract class AbilityType {

    private final String name;
    private final String displayName;
    private final Material icon;
    private final String description;
    private final int interval;
    private final double radius;

    public AbilityType(String name, String displayName, Material icon, String description, int interval, double radius) {
        this.name = name.toUpperCase().replace(" ", "_");
        this.displayName = displayName;
        this.icon = icon;
        this.description = description;
        this.interval = interval;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Material getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public AbilitySettings createDefaults() {
        return new AbilitySettings(interval, radius);
    }

    public List<String> getDetails(AbilitySettings settings) {
        return Collections.emptyList();
    }

    public abstract void execute(LivingEntity entity, Boss boss, AbilitySettings settings, List<Player> targets);
}
