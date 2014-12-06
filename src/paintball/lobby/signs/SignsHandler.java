/*
 * Author: 598Johnn897
 * 
 * Date: Dec 3, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import paintball.lobby.PaintballLobby;

/**
 * 
 */
public class SignsHandler implements Listener
{
	@EventHandler public void onSignClick(PlayerInteractEvent event)
	{
		Block block = event.getClickedBlock();
		Player player = event.getPlayer();
		
		if (!(block.getType() == Material.WALL_SIGN)
				|| !(block.getType() == Material.SIGN_POST))
			return;
		
		if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
			return;
			
		Sign sign = (Sign) block.getState();

		for (Location loc : PaintballLobby.getSignsManager().getActiveSigns())
		{
			if (sign.getLocation().equals(loc))
			{
				PaintballLobby.getSignsManager().activateSign(sign, player);
				PaintballLobby.getSignsManager().updateSign(sign);
			} else
			{
				continue;
			}
		}
	}
}
