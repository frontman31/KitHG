package net.bernielDE.kithg.kit;

import java.util.List;

import net.bernielDE.kithg.main.KHGMainClass;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitManager {

	public static KitType getType(Player p){
		return KHGMainClass.instance().kit.get(p.getName());
	}
	
	public static void setKit(Player p, KitType type){
		switch(type){
		case CRAFTER:
			KitCrafter.giveItems(p);
			KHGMainClass.instance().kit.put(p.getName(), KitType.CRAFTER);
			break;
		case BARBAR:
			KitBarbar.giveItems(p);
			KHGMainClass.instance().kit.put(p.getName(), KitType.BARBAR);
			break;
		}
	}

	public static ItemStack getItem(Material mat, int amount, String name, List<String> lore){
		ItemStack is = new ItemStack(mat, amount);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName(name);
		meta.setLore(lore);
		is.setItemMeta(meta);
		
		return is;
	}
	
}
	
