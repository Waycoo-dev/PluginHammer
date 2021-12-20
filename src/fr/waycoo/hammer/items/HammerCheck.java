package fr.waycoo.hammer.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public class HammerCheck {

    public boolean isHammer(Player player) {

        if(!(player.getInventory().getItemInMainHand().hasItemMeta())) return false;

        if(player.getInventory().getItemInMainHand() == null) return false;

        if(!(player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName())) return false;

        if(!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Hammer")
                && player.getInventory().getItemInMainHand().getType() == Material.DIAMOND_PICKAXE
                && player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {

            return false;
        }
        return true;
    }
}
