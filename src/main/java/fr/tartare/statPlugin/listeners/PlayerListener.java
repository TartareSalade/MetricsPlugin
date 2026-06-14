package fr.tartare.statPlugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class PlayerListener implements Listener {

    @EventHandler

    public void onPlayerJoin(PlayerJoinEvent event) {
        /*
            get the player who joined : player name and player uuid
            timestamp
            worldname, maybe server name if bungeecord ???
         */
        Class<? extends Event> eventType = event.getClass();
        String eventName = eventType.getSimpleName(); // un peu abusé
         // get the player who triggered the event
        Player p = event.getPlayer();
        UUID playerUUID = p.getUniqueId();
        String playerName = String.valueOf(p.displayName());
        String worldName = p.getWorld().getName();
        long timestamp = System.currentTimeMillis();
        System.out.println("[MetricPlugin] " + eventName + " triggered by player " + playerName + " (UUID: " + playerUUID + ") in world " + worldName + " at timestamp " + timestamp);

    }
}
