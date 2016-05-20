package es.goodmem.staffannouncer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AnnouncerPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onStaffJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if(player.hasPermission("staffannouncer.staff")) {
            Bukkit.broadcastMessage(ChatColor.RED + "Staff:" + ChatColor.GOLD + player.getName() + " has joined the game!");
        }
    }
}
