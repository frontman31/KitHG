/**
 * 
 */
package net.bernielDE.kithg.util;

/**
 * @author fl0W
 * @version 0.1
 * 
 * @creation 11.07.2014 at 20:57:57
 * @class GameState.java in @package net.bernielDE.kithg.util in @project KitHG
 **/

public enum GameState {

	LOBBY, 
	
	INGAME,
	
	FINISHED;
	
	private static GameState GS;
	
	private GameState() {
	}
	
	public static void setState(GameState gs) {
		GS = gs;
	}
	
	public static GameState getState() {
		return GS;
	}
}
