package info.tregmine.christmas.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class DeveloperJoinListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		if (e.getPlayer().getName().equals("ice374")){
			Bukkit.broadcastMessage(ChatColor.GOLD + "Please welcome ice374, the creator of Christmas (the plugin) to the server!");
			e.getPlayer().setDisplayName(ChatColor.GOLD + "[Dev] " + ChatColor.DARK_PURPLE + "ice374" + ChatColor.WHITE );
		}
	}
}