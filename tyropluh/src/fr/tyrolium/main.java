package fr.tyrolium;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
		public main() {
		}

	    @Override
	    public void onEnable() {
	        this.getLogger().info("Plugin d�marr� !");
	    }

	    @Override
	    public void onDisable() {
	        this.getLogger().info("Plugin arret� !");
	    }
	
}
