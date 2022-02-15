package main;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Underwater {

	public static void affect(Player p) {
		boost(p);
		particles(p);
	}
	
	public static void boost(Player p) {
		
		if (!Config.underwater_boost_enabled) return;
		
		Vector d = p.getLocation().getDirection();
		Vector v = p.getVelocity();
		v.add(d.multiply(Config.underwater_boost/1000));
		p.setVelocity(v);
	}
	
	public static void particles(Player p) {
		
		if (!Config.underwater_particles_enabled) return;
		
		double floor = Math.floor(Config.underwater_particles_amount);
		
		if (Main.random.nextDouble() < Config.underwater_particles_amount-floor) 
			p.getWorld().spawnParticle(
					Config.underwater_particles_type,
					p.getLocation().getX() + Config.underwater_particles_offsetX,
					p.getLocation().getY() + Config.underwater_particles_offsetY,
					p.getLocation().getZ() + Config.underwater_particles_offsetZ,
					1,
					Config.underwater_particles_spreadX,
					Config.underwater_particles_spreadY,
					Config.underwater_particles_spreadZ,
					Config.underwater_particles_speed
					);
		//spawning 1.2 particles doesn't make sense, which means I have to simulate it by using chance
		
		if (floor > 0)
			p.getWorld().spawnParticle(
				Config.underwater_particles_type,
				p.getLocation().getX() + Config.underwater_particles_offsetX,
				p.getLocation().getY() + Config.underwater_particles_offsetY,
				p.getLocation().getZ() + Config.underwater_particles_offsetZ,
				(int) floor,
				Config.underwater_particles_spreadX,
				Config.underwater_particles_spreadY,
				Config.underwater_particles_spreadZ,
				Config.underwater_particles_speed
				);
	}
	
}
