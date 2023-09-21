package org.rabbit.firstplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class healCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings,) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Zostałeś uleczony");
            player.setHealth(20);
        }
        return false;
    }
}
