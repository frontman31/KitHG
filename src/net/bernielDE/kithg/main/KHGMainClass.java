package net.bernielDE.kithg.main;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import net.bernielDE.kithg.kit.KitType;

/**
 * @author frontman31, thedaniel99m
 * @version 0.1
 * 
 * @creation 11.07.2014 at 19:58:02
 * @class KHGMainClass.java in @package net.bernielDE.kithg.main in @project KitHG
 * 
 * TODO:
 * frontman31: die anderen 50%, Inventory, Utilstuff
 * thedaniel99m: MapBegrenzung, Listener(50%), Kit(50%)
 **/

public class KHGMainClass extends JavaPlugin {
	
	public HashMap<String, KitType> kit = new HashMap<>();
	
	private static KHGMainClass instance;
	
	public KHGMainClass() {
		super();
		instance = this;
	}
	
	public static KHGMainClass instance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
	}
	
	@Override
	public void onLoad() {
		
	}
}
