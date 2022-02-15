package main;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Inair {

	public static void affect(Player p) {
		boost(p);
		particles(p);
	}
	
	public static void boost(Player p) {
		
		if (!Config.inair_boost_enabled) return;
		
		Vector d = p.getLocation().getDirection();
		Vector v = p.getVelocity();
		v.add(d.multiply(Config.inair_boost/1000));
		p.setVelocity(v);
	}
	
	public static void particles(Player p) {
		
		if (!Config.inair_particles_enabled) return;
		
		double floor = Math.floor(Config.inair_particles_amount);
		
		if (Main.random.nextDouble() < Config.inair_particles_amount-floor) 
			p.getWorld().spawnParticle(
					Config.inair_particles_type,
					p.getLocation().getX() + Config.inair_particles_offsetX,
					p.getLocation().getY() + Config.inair_particles_offsetY,
					p.getLocation().getZ() + Config.inair_particles_offsetZ,
					1,
					Config.inair_particles_spreadX,
					Config.inair_particles_spreadY,
					Config.inair_particles_spreadZ,
					Config.inair_particles_speed
					);
		//spawning 1.2 particles doesn't make sense, which means I have to simulate it by using chance
		
		if (floor > 0)
			p.getWorld().spawnParticle(
				Config.inair_particles_type,
				p.getLocation().getX() + Config.inair_particles_offsetX,
				p.getLocation().getY() + Config.inair_particles_offsetY,
				p.getLocation().getZ() + Config.inair_particles_offsetZ,
				(int) floor,
				Config.inair_particles_spreadX,
				Config.inair_particles_spreadY,
				Config.inair_particles_spreadZ,
				Config.inair_particles_speed
				);
	}
	
}
