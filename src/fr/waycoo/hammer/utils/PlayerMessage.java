package fr.waycoo.hammer.utils;

import com.sun.istack.internal.NotNull;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PlayerMessage {

    public void sendSuccessMessage(Player player,@NotNull String message) {
        player.sendMessage(ChatColor.DARK_GREEN + message);
    }

    public void sendErrorMessage(Player player, @NotNull String message) {
        player.sendMessage(ChatColor.DARK_RED +  message);
    }
}
