package com.gmail.nossr50.commands.admin;

import com.gmail.nossr50.config.GeneralConfig;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class DebugBrewingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
            @NotNull String label,
            String[] args) {
        GeneralConfig.toggleInventoryDebugLogging();
        boolean enabled = GeneralConfig.isInventoryDebugLogging();
        sender.sendMessage(ChatColor.DARK_AQUA + "[mcMMO] " + ChatColor.WHITE
                + "Brewing inventory debug logging: "
                + (enabled ? ChatColor.GREEN + "ENABLED" : ChatColor.RED + "DISABLED"));
        return true;
    }
}
