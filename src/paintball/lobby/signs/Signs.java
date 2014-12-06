/*
 * Author: 598Johnn897
 * 
 * Date: Dec 4, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.World;

import paintball.lobby.PaintballLobby;

/**
 * 
 */
public class Signs
{
	static World world = PaintballLobby.getInstance()
			.getServer().getWorld("world");
	
	public static final Location JOIN_SIGN_ONE_ONE = 	new Location(world, -266, 67, -301);
	public static final Location JOIN_SIGN_ONE_TWO =	new Location(world, -266, 67, -300);
	public static final Location JOIN_SIGN_ONE_THREE =	new Location(world, -266, 67, -299);
	public static final Location JOIN_SIGN_ONE_FOUR = 	new Location(world, -266, 67, -298);
	public static final Location JOIN_SIGN_ONE_FIVE = 	new Location(world, -266, 67, -297);

	public static final Location JOIN_SIGN_TWO_ONE = 	new Location(world, -322, 67, -301);
	public static final Location JOIN_SIGN_TWO_TWO = 	new Location(world, -322, 67, -300);
	public static final Location JOIN_SIGN_TWO_THREE = 	new Location(world, -322, 67, -299);
	public static final Location JOIN_SIGN_TWO_FOUR = 	new Location(world, -322, 67, -298);
	public static final Location JOIN_SIGN_TWO_FIVE =   new Location(world, -322, 67, -297);

	public static final Location[] JOIN_SIGNS_LOCATION = {
		
		JOIN_SIGN_ONE_ONE, JOIN_SIGN_ONE_TWO, JOIN_SIGN_ONE_THREE,
		JOIN_SIGN_ONE_FOUR, JOIN_SIGN_ONE_FIVE, JOIN_SIGN_TWO_ONE, 
		JOIN_SIGN_TWO_TWO, JOIN_SIGN_TWO_THREE, JOIN_SIGN_TWO_FOUR, 
		JOIN_SIGN_TWO_FIVE
		
	};
	
	public static final HashMap<Location, String> signIDs = new HashMap<Location, String>();
	static {
		signIDs.put(JOIN_SIGN_ONE_ONE, 		"0-1");
		signIDs.put(JOIN_SIGN_ONE_TWO, 		"0-2");
		signIDs.put(JOIN_SIGN_ONE_THREE, 	"0-3");
		signIDs.put(JOIN_SIGN_ONE_FOUR, 	"0-4");
		signIDs.put(JOIN_SIGN_ONE_FIVE, 	"0-5");

		signIDs.put(JOIN_SIGN_TWO_ONE, 		"0-1");
		signIDs.put(JOIN_SIGN_TWO_TWO, 		"0-2");
		signIDs.put(JOIN_SIGN_TWO_THREE, 	"0-3");
		signIDs.put(JOIN_SIGN_TWO_FOUR, 	"0-4");
		signIDs.put(JOIN_SIGN_TWO_FIVE, 	"0-5");
	}
}
