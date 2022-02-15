package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Commands implements CommandExecutor{

	private JavaPlugin plugin;
	
	public Commands(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if (args.length == 0) {
			p.sendMessage("-=+=- UnlimitedElytra-=+=-");
			p.sendMessage("Author: Lupus_Z");
			p.sendMessage("Version: 2.0.0");
			p.sendMessage("Github: github.com/dennisorlando/unlimitedelytra");
			p.sendMessage("Usage: /unlimitedelytra <reload|reset>");
		}
		
		if (args[0].equalsIgnoreCase("reset")) {
			Config.resetConfig(plugin);
		}
		if (args[0].equalsIgnoreCase("reload")) {
			Config.reloadConfig(plugin);
		}
		
		return true;
	}

}
