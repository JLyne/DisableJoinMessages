package uk.co.notnull.disablejoinmessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableJoinMessages extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@Override
	public void onDisable() {
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.joinMessage(null);
	}

	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		e.quitMessage(null);
	}
}
