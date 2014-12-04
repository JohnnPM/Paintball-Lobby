/*
 * Author: 598Johnn897
 * 
 * Date: Dec 3, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * 
 */
public class SignsHandler implements Listener
{	
	@EventHandler public void onSignClick(PlayerInteractEvent event)
	{
		Block block = event.getClickedBlock();
		
		if (block.getType() == Material.WALL_SIGN
				|| block.getType() == Material.SIGN_POST)
		{
			Sign sign = (Sign) block.getState();
			
		} else 
		{
			return;
		}
	}
}
