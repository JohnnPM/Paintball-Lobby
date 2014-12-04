/*
 * Author: 598Johnn897
 * 
 * Date: Dec 4, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

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
	
	public static final Location JOIN_SIGN_ONE_ONE = new Location(world, -266, 67, -301);
	public static final Location JOIN_SIGN_ONE_TWO = new Location(world, -266, 67, -300);
	public static final Location JOIN_SIGN_ONE_THREE = new Location(world, -266, 67, -299);
	public static final Location JOIN_SIGN_ONE_FOUR = new Location(world, -266, 67, -298);
	public static final Location JOIN_SIGN_ONE_FIVE = new Location(world, -266, 67, -297);

	public static final Location JOIN_SIGN_TWO_ONE = new Location(world, -322, 67, -301);
	public static final Location JOIN_SIGN_TWO_TWO = new Location(world, -322, 67, -300);
	public static final Location JOIN_SIGN_TWO_THREE = new Location(world, -322, 67, -299);
	public static final Location JOIN_SIGN_TWO_FOUR = new Location(world, -322, 67, -298);
	public static final Location JOIN_SIGN_TWO_FIVE = new Location(world, -322, 67, -297);

	public static final Location[] JOIN_SIGNS_LOCATION = {JOIN_SIGN_ONE_ONE, JOIN_SIGN_ONE_TWO, JOIN_SIGN_ONE_THREE
		,JOIN_SIGN_ONE_FOUR, JOIN_SIGN_ONE_FIVE, JOIN_SIGN_TWO_ONE, JOIN_SIGN_TWO_TWO,
		JOIN_SIGN_TWO_THREE, JOIN_SIGN_TWO_FOUR, JOIN_SIGN_TWO_FIVE};
}
