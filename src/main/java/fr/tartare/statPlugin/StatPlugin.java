package fr.tartare.statPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class StatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin disable");
    }
}
