package fr.tyrolium.maxime.plugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	
	    @Override
	    public void onEnable() {
	        System.out.println("Plugin demarer");
	        PluginManager pm = getServer().getPluginManager();
	        pm.registerEvents(new commande(this), this);
	    }
	    
	    @Override
	    public void onDisable() {
	        System.out.println("Plugin arrete");
	    }
	    
}
