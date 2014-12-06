/*
 * Author: 598Johnn897
 * 
 * Date: Dec 3, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

import java.util.ArrayList;

import lombok.Getter;

import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import paintball.lobby.lib.References;
import paintball.lobby.util.ColorUtil;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

/**
 * 
 */
public class SignsManager
{
	@Getter public ArrayList<Location> activeSigns = new ArrayList<Location>();
	@Getter public ArrayList<Location> inactiveSigns = new ArrayList<Location>();

	@Getter public static SignsManager instance;

	public SignsManager()
	{
		instance = this;
	}

	private Plugin plugin;

	public void init(Plugin plugin)
	{
		this.plugin = plugin;

		for (Location loc : Signs.JOIN_SIGNS_LOCATION)
		{
			inactiveSigns.add(loc);
		}
	}

	public void setSignInactive(Sign sign)
	{
		if (activeSigns.contains(sign.getLocation()))
			activeSigns.remove(sign.getLocation());

		if (!inactiveSigns.contains(sign.getLocation()))
			inactiveSigns.add(sign.getLocation());
		
		sign.setLine(0, ColorUtil.formatString(SignFormats.SIGN_FORMAT_INACTIVE_LINE_1));
		sign.setLine(1, ColorUtil.formatString(SignFormats.SIGN_FORMAT_INACTIVE_LINE_2));
		sign.setLine(2, ColorUtil.formatString(SignFormats.SIGN_FORMAT_INACTIVE_LINE_3));
		sign.setLine(3, ColorUtil.formatString(SignFormats.SIGN_FORMAT_INACTIVE_LINE_4));

		sign.update();
	}

	public void setSignActive(Sign sign)
	{
		if (inactiveSigns.contains(sign.getLocation()))
			inactiveSigns.remove(sign.getLocation());

		if (!activeSigns.contains(sign.getLocation()))
			activeSigns.add(sign.getLocation());
		
		sign.setLine(0, ColorUtil.formatString(SignFormats.SIGN_FORMAT_ACTIVE_LINE_1));
		sign.setLine(1, ColorUtil.formatString(SignFormats.SIGN_FORMAT_ACTIVE_LINE_2, Signs.signIDs.get(sign.getLocation())));
		sign.setLine(2, ColorUtil.formatString(SignFormats.SIGN_FORMAT_ACTIVE_LINE_3));
		sign.setLine(3, ColorUtil.formatString(SignFormats.SIGN_FORMAT_ACTIVE_LINE_4));
		
		sign.update();
	}

	public void updateSign(Sign sign)
	{

	}

	public void setSignInProgress(Sign sign)
	{

	}

	public void activateSign(Sign sign, Player player)
	{
		ByteArrayDataOutput out = ByteStreams.newDataOutput();

		out.writeUTF("Connect");
		out.writeUTF("pb"
				+ Signs.signIDs.get(sign.getLocation()).replaceAll("-", ""));

		player.sendMessage(ColorUtil.formatString(
				"<green>Sending you to %s...",
				"pb"
						+ Signs.signIDs.get(sign.getLocation()).replaceAll("-",
								"")));

		player.sendPluginMessage(plugin, References.PB_MSG_CHANNEL,
				out.toByteArray());
	}

	public void startAutoUpdates()
	{

	}
}
