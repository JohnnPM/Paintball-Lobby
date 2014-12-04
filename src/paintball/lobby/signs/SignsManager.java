/*
 * Author: 598Johnn897
 * 
 * Date: Dec 3, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.plugin.Plugin;


/**
 * 
 */
public class SignsManager
{
	public ArrayList<Location> activeSigns = new ArrayList<Location>();
	public ArrayList<Location> inactiveSigns = new ArrayList<Location>();
	
	public void init(Plugin plugin)
	{
		for (Location loc : Signs.JOIN_SIGNS_LOCATION)
		{
			
		}
	}
}
