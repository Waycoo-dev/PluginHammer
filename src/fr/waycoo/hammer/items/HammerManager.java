package fr.waycoo.hammer.items;

import fr.waycoo.hammer.utils.PlayerMessage;
import fr.waycoo.hammer.utils.PluginName;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class HammerManager {

    private final PlayerMessage playerMessage;

    public HammerManager(Player player, PlayerMessage playerMessage) {
        this.playerMessage = playerMessage;
        this.setHammer(player);
    }

    private void setHammer(Player player) {

        if(!this.isEmpty(player)) return;

        player.getInventory().addItem(new ItemBuilder(Material.DIAMOND_PICKAXE, 1)
                .setLore(Arrays.asList(ChatColor.GOLD + "Super-Pickaxe for break in 3x3", "Created by wAycoo_"))
                .setName("§6Hammer")
                .addEnchant(Enchantment.DIG_SPEED, 5)
                .build());

        playerMessage.sendSuccessMessage(player, PluginName.PREFIX + "Vous venez de recevoir votre Hammer");
    }

    private boolean isEmpty(Player player) {

        if(player.getInventory().firstEmpty() == -1) {
            playerMessage.sendErrorMessage(player, PluginName.PREFIX + "Votre inventaire est plein !");
            return false;
        }
        return true;
    }
}
