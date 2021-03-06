package main;

import java.util.Random;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static Random random;
	
	private static MainLoop loop;
	
	public void onEnable() {
		
		random = new Random();
		
		//Config.addDefaults(this);
		saveDefaultConfig();
		Config.loadValues(this);
		
		getCommand("unlimitedelytra").setExecutor(new Commands(this));
		
		MainLoop.exit = false;
		loop = new MainLoop(this);
		loop.start();
	}

	public void onDisable() {
		MainLoop.exit = true;
	}
	
}
