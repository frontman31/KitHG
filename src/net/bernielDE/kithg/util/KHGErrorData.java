package net.bernielDE.kithg.util;

import org.bukkit.ChatColor;

import net.bernielDE.kithg.main.KHGMainClass;

public enum KHGErrorData {
	
	NO_PERMISSION("You don't have permission!"),
	NO_PLAYER("You aren't an instance of a player!"),
	KICKED_WHILST_ACTION("You were kicked during a reload!");
	
	private final String ERROR;
	
	private KHGErrorData(String err) {
		this.ERROR = err;
	}
	
	public String getError() {
		return this.ERROR;
	}
	
	@Override
	public String toString() {
		return KHGMainClass.PREFIX + (KHGMainClass.ERROR_PREFIX ? ChatColor.RED + "Error: " : "") +
				KHGMainClass.DESIGN + this.ERROR;
	}
	
	public static String prefix() {
		return KHGMainClass.PREFIX + (KHGMainClass.ERROR_PREFIX ? ChatColor.RED + "Error: " : "") + KHGMainClass.DESIGN;
	}
}
