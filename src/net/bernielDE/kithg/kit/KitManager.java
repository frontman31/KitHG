package net.bernielDE.kithg.kit;

import net.bernielDE.kithg.main.KHGMainClass;

import org.bukkit.entity.Player;

public class KitManager {

	public static KitType getType(Player p){
		return KHGMainClass.instance().kit.get(p.getName());
	}

}
	
