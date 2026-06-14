package fr.tartare.statPlugin;

import fr.tartare.statPlugin.listeners.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class StatPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin started");
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin disable");
    }
}
