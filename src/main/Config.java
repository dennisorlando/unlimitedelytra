package main;

import java.io.File;

import org.bukkit.Particle;
import org.bukkit.plugin.java.JavaPlugin;

public class Config{
	
	//inair
	public static boolean inair_boost_enabled;
	public static double inair_boost;
	public static boolean inair_particles_enabled;
	public static Particle inair_particles_type;
	public static double inair_particles_amount;
	public static double inair_particles_speed;
	public static double inair_particles_offsetX;
	public static double inair_particles_offsetY;
	public static double inair_particles_offsetZ;
	public static double inair_particles_spreadX;
	public static double inair_particles_spreadY;
	public static double inair_particles_spreadZ;
	
	//underwater
	public static boolean underwater_boost_enabled;
	public static double underwater_boost;
	public static boolean underwater_particles_enabled;
	public static Particle underwater_particles_type;
	public static double underwater_particles_amount;
	public static double underwater_particles_speed;
	public static double underwater_particles_offsetX;
	public static double underwater_particles_offsetY;
	public static double underwater_particles_offsetZ;
	public static double underwater_particles_spreadX;
	public static double underwater_particles_spreadY;
	public static double underwater_particles_spreadZ;
	
	//overwater
	public static boolean overwater_particles_realistic;
	public static double overwater_distance_from_water;
	public static boolean overwater_particles_enabled;
	public static Particle overwater_particles_type;
	public static double overwater_particles_amount;
	public static double overwater_particles_speed;
	public static double overwater_particles_offsetX;
	public static double overwater_particles_offsetY;
	public static double overwater_particles_offsetZ;
	public static double overwater_particles_spreadX;
	public static double overwater_particles_spreadY;
	public static double overwater_particles_spreadZ;
	
	public static void loadValues(JavaPlugin plugin) {

		inair_boost_enabled = plugin.getConfig().getBoolean("inair.boost_enabled");
		inair_boost = plugin.getConfig().getDouble("inair.boost");
		inair_particles_enabled = plugin.getConfig().getBoolean("inair.particles.enabled");
		inair_particles_type = Particle.valueOf(plugin.getConfig().getString("inair.particles.type"));
		inair_particles_amount = plugin.getConfig().getDouble("inair.particles.amount");
		inair_particles_speed = plugin.getConfig().getDouble("inair.particles.speed");
		inair_particles_offsetX = plugin.getConfig().getDouble("inair.particles.offset.x");
		inair_particles_offsetY = plugin.getConfig().getDouble("inair.particles.offset.y");
		inair_particles_offsetZ = plugin.getConfig().getDouble("inair.particles.offset.z");
		inair_particles_spreadX = plugin.getConfig().getDouble("inair.particles.spread.x");
		inair_particles_spreadY = plugin.getConfig().getDouble("inair.particles.spread.y");
		inair_particles_spreadZ = plugin.getConfig().getDouble("inair.particles.spread.z");
		
		underwater_boost_enabled = plugin.getConfig().getBoolean("underwater.boost_enabled");
		underwater_boost = plugin.getConfig().getDouble("underwater.boost");
		underwater_particles_enabled = plugin.getConfig().getBoolean("underwater.particles.enabled");
		underwater_particles_type = Particle.valueOf(plugin.getConfig().getString("underwater.particles.type"));
		underwater_particles_amount = plugin.getConfig().getDouble("underwater.particles.amount");
		underwater_particles_speed = plugin.getConfig().getDouble("underwater.particles.speed");
		underwater_particles_offsetX = plugin.getConfig().getDouble("underwater.particles.offset.x");
		underwater_particles_offsetY = plugin.getConfig().getDouble("underwater.particles.offset.y");
		underwater_particles_offsetZ = plugin.getConfig().getDouble("underwater.particles.offset.z");
		underwater_particles_spreadX = plugin.getConfig().getDouble("underwater.particles.spread.x");
		underwater_particles_spreadY = plugin.getConfig().getDouble("underwater.particles.spread.y");
		underwater_particles_spreadZ = plugin.getConfig().getDouble("underwater.particles.spread.z");
		
		overwater_distance_from_water = plugin.getConfig().getDouble("overwater.distance_from_water");
		overwater_particles_enabled = plugin.getConfig().getBoolean("overwater.particles.enabled");
		overwater_particles_realistic = plugin.getConfig().getBoolean("overwater.particles.realistic");
		overwater_particles_type = Particle.valueOf(plugin.getConfig().getString("overwater.particles.type"));
		overwater_particles_amount = plugin.getConfig().getDouble("overwater.particles.amount");
		overwater_particles_speed = plugin.getConfig().getDouble("overwater.particles.speed");
		overwater_particles_offsetX = plugin.getConfig().getDouble("overwater.particles.offset.x");
		overwater_particles_offsetY = plugin.getConfig().getDouble("overwater.particles.offset.y");
		overwater_particles_offsetZ = plugin.getConfig().getDouble("overwater.particles.offset.z");
		overwater_particles_spreadX = plugin.getConfig().getDouble("overwater.particles.spread.x");
		overwater_particles_spreadY = plugin.getConfig().getDouble("overwater.particles.spread.y");
		overwater_particles_spreadZ = plugin.getConfig().getDouble("overwater.particles.spread.z");
	}
	
	public static void addDefaults(JavaPlugin plugin) {
		
		plugin.getConfig().addDefault("inair.boost_enabled", true);
		plugin.getConfig().addDefault("inair.boost", 2);
		plugin.getConfig().addDefault("inair.particles.enabled", true);
		plugin.getConfig().addDefault("inair.particles.type", "SOUL_FIRE_FLAME");
		plugin.getConfig().addDefault("inair.particles.amount", 0.02);
		plugin.getConfig().addDefault("inair.particles.speed", 0.1);
		plugin.getConfig().addDefault("inair.particles.offset.x", 0);
		plugin.getConfig().addDefault("inair.particles.offset.y", 0.2);
		plugin.getConfig().addDefault("inair.particles.offset.z", 0);
		plugin.getConfig().addDefault("inair.particles.spread.x", 0.3);
		plugin.getConfig().addDefault("inair.particles.spread.y", 0);
		plugin.getConfig().addDefault("inair.particles.spread.z", 0.3);
		
		
		plugin.getConfig().addDefault("underwater.boost_enabled", true);
		plugin.getConfig().addDefault("underwater.boost", 5);
		plugin.getConfig().addDefault("underwater.particles.enabled", true);
		plugin.getConfig().addDefault("underwater.particles.type", "WATER_BUBBLE");
		plugin.getConfig().addDefault("underwater.particles.amount", 1);
		plugin.getConfig().addDefault("underwater.particles.speed", 0.3);
		plugin.getConfig().addDefault("underwater.particles.offset.x", 0);
		plugin.getConfig().addDefault("underwater.particles.offset.y", 0.2);
		plugin.getConfig().addDefault("underwater.particles.offset.z", 0);
		plugin.getConfig().addDefault("underwater.particles.spread.x", 0.2);
		plugin.getConfig().addDefault("underwater.particles.spread.y", 0.2);
		plugin.getConfig().addDefault("underwater.particles.spread.z", 0.2);
		
		plugin.getConfig().addDefault("overwater.particles.enabled", true);
		plugin.getConfig().addDefault("overwater.distance_from_water", 5);
		plugin.getConfig().addDefault("overwater.particles.realistic", true);
		plugin.getConfig().addDefault("overwater.particles.type", "WATER_WAKE");
		plugin.getConfig().addDefault("overwater.particles.amount", 10);
		plugin.getConfig().addDefault("overwater.particles.speed", 0.1);
		plugin.getConfig().addDefault("overwater.particles.offset.x", 0);
		plugin.getConfig().addDefault("overwater.particles.offset.y", 1);
		plugin.getConfig().addDefault("overwater.particles.offset.z", 0);
		plugin.getConfig().addDefault("overwater.particles.spread.x", 0.25);
		plugin.getConfig().addDefault("overwater.particles.spread.y", 0.1);
		plugin.getConfig().addDefault("overwater.particles.spread.z", 0.25);
		
		plugin.getConfig().options().copyDefaults(true);
		plugin.saveConfig();
	}
	
	public static void reloadConfig(JavaPlugin plugin) {
		plugin.reloadConfig();
		loadValues(plugin);
	}
	
	public static void resetConfig(JavaPlugin plugin) {
		File file = new File(plugin.getDataFolder(), "config.yml");
        file.delete();
       
        plugin.saveDefaultConfig();
        
        reloadConfig(plugin);
        
	    //loadValues(plugin);
	    
	}
	
}
