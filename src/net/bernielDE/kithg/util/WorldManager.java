package net.bernielDE.kithg.util;

import java.io.File;

public class WorldManager {
	
	public static void deleteWorld(File file){
		for(File f : file.listFiles()){
			if(f.isDirectory()){
				deleteWorld(f);
			}
			f.delete();
		}
		file.delete();
	}

}
