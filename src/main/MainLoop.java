package main;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainLoop extends Thread{

	public static boolean exit;
	
	private static final int REFRESH_RATE = 144;
	private JavaPlugin plugin;
	
	public MainLoop(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	public void run() {
		while(!exit) {
			long checkpointA = System.currentTimeMillis();
			
			coolStuff();
			
			long checkpointB = System.currentTimeMillis();
			
			try {
				sleep(Math.max(0, 1000L/REFRESH_RATE - (checkpointB-checkpointA)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void coolStuff() {
		for (Player p : plugin.getServer().getOnlinePlayers()) {
			
			Block b = p.getWorld().getBlockAt(p.getLocation());
		
			//raycast
			int i = 0;
			while(p.getWorld().getBlockAt(p.getLocation().subtract(0, i, 0)).getType() == Material.AIR) {
				i++;
			}
			
			Block b2 = p.getWorld().getBlockAt(p.getLocation().subtract(0, i, 0)); //block under the player
			double distance = p.getLocation().getY()-b2.getY(); //distance from that block
			
			if (b.getType() == Material.AIR && p.isSprinting() && p.isGliding()) {
				Inair.affect(p);
				
				if (b2.getType() == Material.WATER && distance < Config.overwater_distance_from_water) {
					Overwater.affect(p, distance);
				}
				
			}
			if (b.getType() == Material.WATER && p.isSprinting() && p.isGliding()) {
				Underwater.affect(p);
			}
			
		}
	}
}
