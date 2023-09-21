package org.rabbit.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin  implements Listener {

    @Override
    public void onEnable() {
        System.out.println("----------------------------------------");
        System.out.println("            Team RX - Plugins           ");
        System.out.println("            Przykladowy plugin          ");
        System.out.println("              Autor Rabbicik            ");
        System.out.println(" Discord: https://discord.gg/BxHchTBFeZ ");
        System.out.println("----------------------------------------");
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("heal").setExecutor(new healCommand());
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {

        e.getPlayer().sendMessage(ChatColor.BLUE + "Rzucasz jajkem");


    }
}
