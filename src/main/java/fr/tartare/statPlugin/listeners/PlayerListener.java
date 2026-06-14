package fr.tartare.statPlugin.listeners;

import net.kyori.adventure.text.ComponentLike;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

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


    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){
        Class<? extends Event> eventType = event.getClass();
        String eventName = eventType.getSimpleName();

        Player player = event.getPlayer();
        UUID playerUUID = player.getUniqueId();
        String playerName = String.valueOf(player.displayName());
        String worldName = player.getWorld().getName();
        long timestamp = System.currentTimeMillis();
        System.out.println("[MetricPlugin] " + eventName + " triggered by player " + playerName + " (UUID: " + playerUUID + ") in world " + worldName + " at timestamp " + timestamp);
    }

    @EventHandler
    public void onBreakEvent(BlockBreakEvent event){
        Class<? extends Event> eventType = event.getClass();
        String eventName = eventType.getSimpleName();
        /*
        get eventType
        playerUUID
        playerName
        blockType
        worldName
        timestamp
        pos(x,y,z)
         */
        Player player = event.getPlayer();
        UUID playerUUID = player.getUniqueId();
        String playerName = String.valueOf(player.displayName());
        String blockType = event.getBlock().getType().toString();
        String worldName = player.getWorld().getName();
        //var pos = player.getPose();
        long timestamp = System.currentTimeMillis();
        var pos = player.getLocation();
        player.sendMessage("DEBUG POS + ", String.valueOf(pos));
        player.sendMessage("DEBUG PLAYER NAME + ", playerName);
        System.out.println("[MetricPlugin] " + eventName + " triggered by player " + playerName + " (UUID: " + playerUUID + ") in world " + worldName + " at timestamp " + timestamp + " breaking block of type " + blockType);
    }

}
