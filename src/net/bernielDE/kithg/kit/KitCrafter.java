package net.bernielDE.kithg.kit;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class KitCrafter implements Listener {
	
	public static String prefix = "Crafter";
	
	@SuppressWarnings("deprecation")
	public static void giveItems(Player p){
		p.getInventory().clear();
		p.getInventory().setArmorContents(null);
		p.getInventory().addItem(new ItemStack(Material.WOOD_AXE));
		p.getInventory().addItem(new ItemStack(Material.WOOD_PICKAXE));
		p.getInventory().addItem(new ItemStack(Material.WORKBENCH));
		p.updateInventory();
	}

}
