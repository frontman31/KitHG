package net.bernielDE.kithg.main;

import java.io.File;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.World.Environment;
import org.bukkit.WorldType;
import org.bukkit.plugin.java.JavaPlugin;

import net.bernielDE.kithg.kit.KitType;
import net.bernielDE.kithg.util.WorldManager;

/**
 * @author frontman31, thedaniel99m
 * @version 0.1
 * 
 * @creation 11.07.2014 at 19:58:02
 * @class KHGMainClass.java in @package net.bernielDE.kithg.main in @project KitHG
 * 
 * TODO:
 * frontman31: die anderen 50%, Inventory, Utilstuff, Countdown
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
		this.getConfig().addDefault("WorldName", "arena");
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		String worldname = this.getConfig().getString("WorldName");
		WorldCreator wc = new WorldCreator(worldname);
		wc.environment(Environment.NORMAL);
		wc.type(WorldType.VERSION_1_1);
		Bukkit.createWorld(wc);
	}
	
	@Override
	public void onLoad() {
		String name = this.getConfig().getString("WorldName");
		WorldManager.deleteWorld(new File(name));
	}
	
	
}
