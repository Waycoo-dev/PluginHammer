package fr.waycoo.hammer;

import fr.waycoo.hammer.items.HammerCheck;
import fr.waycoo.hammer.listener.HammerBreakEvent;
import fr.waycoo.hammer.utils.PlayerMessage;
import org.bukkit.plugin.java.JavaPlugin;

import fr.waycoo.hammer.commands.HammerCommands;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		System.out.println("--------------------------");
		System.out.println("     Hammer by Waycoo_");
		System.out.println("--------------------------");
		registerEvents();
		registerCommands();
	}
	
	@Override
	public void onDisable() {

	}

	private void registerCommands() {
		getCommand("hammer").setExecutor(new HammerCommands(new PlayerMessage()));
	}

	private void registerEvents() {
		getServer().getPluginManager().registerEvents(new HammerBreakEvent(new HammerCheck()), this);
	}
}

