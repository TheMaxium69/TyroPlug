package fr.tyrolium.maxime.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class commande implements Listener {

	public commande(main main) {
		
	}

	@EventHandler
	public void onCommandes(PlayerCommandPreprocessEvent e) {
		
		Player p = e.getPlayer();
		String msg = e.getMessage();
		String[] args = msg.split(" ");
		
		if(args[0].equalsIgnoreCase("/test")) {
			
			p.sendMessage(ChatColor.DARK_RED+"Bravo tu as reussi le test");
			e.setCancelled(true);
			
		}else if (args[0].equalsIgnoreCase("/broadcast")) {
			
			if(p.hasPermission("broadcast.use")) {
				
			p.getServer().broadcastMessage(ChatColor.DARK_BLUE+"[ANNONCE]"+ChatColor.DARK_GREEN+"Ceci Est Une Annonce");
			
			} else {
				

				p.sendMessage(ChatColor.RED+"Vous Avez pas les permission");
				
			}
			
			e.setCancelled(true);
			
		}
		
	}

}
