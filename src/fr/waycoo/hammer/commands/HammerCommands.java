package fr.waycoo.hammer.commands;

import fr.waycoo.hammer.items.HammerManager;
import fr.waycoo.hammer.utils.PlayerMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class HammerCommands implements CommandExecutor{

	private final PlayerMessage playerMessage;

	public HammerCommands(PlayerMessage playerMessage) {
		this.playerMessage = playerMessage;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(!(sender instanceof Player)) return false;
		Player player = (Player) sender;

		if(label.equalsIgnoreCase("hammer")) {

			new HammerManager(player, playerMessage);

			return true;
		}
		return false;
	}
}
