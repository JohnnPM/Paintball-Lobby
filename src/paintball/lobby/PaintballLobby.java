/*
 * Author: 598Johnn897
 * 
 * Date: Nov 27, 2014
 * Package: paintball.lobby
 *
 */
package paintball.lobby;

import lombok.Getter;

import org.bukkit.plugin.java.JavaPlugin;

import paintball.lobby.bungee.PluginMessaging;
import paintball.lobby.lib.References;
import paintball.lobby.util.EventUtil;

/**
 * 
 */
public class PaintballLobby extends JavaPlugin
{
	static @Getter private PaintballLobby instance;

	@Override public void onLoad()
	{
		instance = this; // KTHNXBAI
	}

	@Override public void onEnable()
	{
		EventUtil.registerEvents(getInstance());

		this.getServer()
				.getMessenger()
				.registerOutgoingPluginChannel(getInstance(), References.PB_MSG_CHANNEL);
		this.getServer()
				.getMessenger()
				.registerIncomingPluginChannel(getInstance(),
						References.PB_MSG_CHANNEL, new PluginMessaging());
		
	}

	@Override public void onDisable()
	{

	}
}
