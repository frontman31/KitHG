package net.bernielDE.kithg.kit;

public enum KitType {

  CRAFTER("Crafter"); 
	
	private String name;
	
	private KitType(String name) {
		this.name = name;
	}
	
	@Override
		public String toString() {
		return name;
	}

}

