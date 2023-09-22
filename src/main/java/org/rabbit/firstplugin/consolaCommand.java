package org.rabbit.firstplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class consolaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ((Player) sender).sendMessage("dla consoli to jest");
        } else {
            System.out.println("masz bo konsolka jest thebest");
        }

        return false;
    }
}
