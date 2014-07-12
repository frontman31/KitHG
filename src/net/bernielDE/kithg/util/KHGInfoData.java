package net.bernielDE.kithg.util;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;

import net.bernielDE.kithg.main.KHGMainClass;

public enum KHGInfoData {
	
	GAME_STARTED("The game has been started. Good luck and have fun!");
	
	private final String INFO;
	
	private KHGInfoData(String info) {
		this.INFO = info;
	}
	
	public String getInfo() {
		return this.INFO;
	}
	
	@Override
	public String toString() {
		return KHGMainClass.PREFIX + (KHGMainClass.INFO_PREFIX ? ChatColor.RED + "Info: " : "") + 
				KHGMainClass.DESIGN + this.INFO;
	}
	
	public static String prefix() {
		return KHGMainClass.PREFIX + (KHGMainClass.INFO_PREFIX ? ChatColor.RED + "Info: " : "") + 
				KHGMainClass.DESIGN;
	}
	
	public static void logEnable(Logger log, PluginDescriptionFile pdf) {
		log.info("=====================");
		log.info("Plugin enabling...");
		log.info("Version: " + pdf.getVersion());
		log.info("MainClass: " + pdf.getMain());
		log.info("Website: " + pdf.getWebsite());
		log.info("Authors: " + pdf.getAuthors());
		log.info("MySQL-Backend enabled: " + KHGMainClass.MYSQL);
		log.info("File-Backend enabled: " + KHGMainClass.FILE);
		log.info("If you notice any bugs/issues, please contact the developer on " + pdf.getWebsite());
		log.info("Thanks for using this plugin! :)");
		log.info("=====================");
	}
	
	public static void logDisable(Logger log) {
		log.info("=====================");
		log.info("Plugin disabling...");
		log.info("You enjoyed using this plugin? Support us! :)");
		log.info("=====================");
	}
}
