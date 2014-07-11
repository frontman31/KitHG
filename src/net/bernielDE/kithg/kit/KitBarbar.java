package net.bernielDE.kithg.kit;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitBarbar {
	
	public static String name = "Barbar";
	
	@SuppressWarnings("deprecation")
	public static void giveItems(Player p){
		p.getInventory().clear();
		p.getInventory().setArmorContents(null);
		ItemStack helm = new ItemStack(Material.LEATHER_HELMET);
		helm.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack plate = new ItemStack(Material.LEATHER_CHESTPLATE);
		plate.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
		leggings.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
		boots.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		
		ItemStack sword = new ItemStack(Material.WOOD_SWORD);
		sword.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		
		p.getInventory().addItem(sword, helm, plate, leggings, boots);
		p.updateInventory();
	}

}
