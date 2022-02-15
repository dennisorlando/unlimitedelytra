package main;

import org.bukkit.entity.Player;

public class Overwater {
	
	public static void affect(Player p, double distance) {
		particles(p, distance);
	}
	
	public static void particles(Player p, double distance) {
		
		if (!Config.overwater_particles_enabled) return;
		
		double factor = (Config.overwater_particles_realistic) ? p.getVelocity().length()/distance : 1D;
		
		double floor = Math.floor(Config.overwater_particles_amount*factor);
		
		if (Main.random.nextDouble() < Config.overwater_particles_amount*factor-floor) 
			p.getWorld().spawnParticle(
					Config.overwater_particles_type,
					p.getLocation().getX() + Config.overwater_particles_offsetX,
					p.getLocation().getY() + Config.overwater_particles_offsetY - distance,
					p.getLocation().getZ() + Config.overwater_particles_offsetZ,
					1,
					Config.overwater_particles_spreadX*1D/factor,
					Config.overwater_particles_spreadY*1D/factor,
					Config.overwater_particles_spreadZ*1D/factor,
					Config.overwater_particles_speed
					);
		//spawning 1.2 particles doesn't make sense, which means I have to simulate it by using chance
		
		if (floor > 0)
			p.getWorld().spawnParticle(
				Config.overwater_particles_type,
				p.getLocation().getX() + Config.overwater_particles_offsetX,
				p.getLocation().getY() + Config.overwater_particles_offsetY - distance,
				p.getLocation().getZ() + Config.overwater_particles_offsetZ,
				(int) (floor),
				Config.overwater_particles_spreadX*1D/factor,
				Config.overwater_particles_spreadY*1D/factor,
				Config.overwater_particles_spreadZ*1D/factor,
				Config.overwater_particles_speed
				);
		
	}
	
}
