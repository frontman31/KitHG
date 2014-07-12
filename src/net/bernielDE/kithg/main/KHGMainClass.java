package net.bernielDE.kithg.main;

import java.io.File;
import java.util.HashMap;

import net.bernielDE.kithg.kit.KitType;
import net.bernielDE.kithg.util.GameState;
import net.bernielDE.kithg.util.KHGErrorData;
import net.bernielDE.kithg.util.KHGInfoData;
import net.bernielDE.kithg.util.WorldManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

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
	
	public static String PREFIX = "";
	
	public static String DESIGN = "";
	
	public static String KIT_COLOR = "";
	
	public static boolean MYSQL;
	
	public static boolean FILE;
	
	public static boolean ERROR_PREFIX;
	
	public static boolean INFO_PREFIX;
	
	public static boolean LOBBY;
	
	public static boolean BUNGEECORD;
	
	public static boolean MAP_VOTING;
	
	@Override
	public void onEnable() {
		KHGInfoData.logEnable(getLogger(), getDescription());
		
		this.getConfig().addDefault("WorldName", "arena");
		this.getConfig().addDefault("prefix", "[default]");
		this.getConfig().addDefault("design", "&f");
		this.getConfig().addDefault("kit_color", "&f");
		this.getConfig().addDefault("error_prefix", false);
		this.getConfig().addDefault("info_prefix", false);
		this.getConfig().addDefault("lobby", false);
		this.getConfig().addDefault("bungeecord", false);
		this.getConfig().addDefault("map_voting", false);
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		PREFIX = this.getConfig().getString("prefix");
		PREFIX = ChatColor.translateAlternateColorCodes('&', PREFIX);
		
		DESIGN = this.getConfig().getString("design");
		DESIGN = ChatColor.translateAlternateColorCodes('&', DESIGN);
		
		KIT_COLOR = this.getConfig().getString("kit_color");
		KIT_COLOR = ChatColor.translateAlternateColorCodes('&', KIT_COLOR);
		
		ERROR_PREFIX = this.getConfig().getBoolean("error_prefix");
		
		INFO_PREFIX = this.getConfig().getBoolean("info_prefix");
		
		LOBBY = this.getConfig().getBoolean("lobby");
		
		BUNGEECORD = this.getConfig().getBoolean("bungeecord");
		
		MAP_VOTING = this.getConfig().getBoolean("map_voting");
		
		if(LOBBY) {
			GameState.setState(GameState.LOBBY);
		}
		
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
	
	@Override
	public void onDisable() {
		KHGInfoData.logDisable(getLogger());
		if(GameState.getState() == GameState.LOBBY 
				|| GameState.getState() == GameState.INGAME) {
			for (Player p : Bukkit.getOnlinePlayers()) {
				p.kickPlayer(KHGErrorData.KICKED_WHILST_ACTION.toString());
			}
		}
	}
}
