/*
 * Author: 598Johnn897
 * 
 * Date: Dec 5, 2014
 * Package: paintball.lobby.signs
 *
 */
package paintball.lobby.signs;

/**
 * 
 */
public class SignFormats
{
	public static final String SIGN_FORMAT_INACTIVE_LINE_1 = "";
	public static final String SIGN_FORMAT_INACTIVE_LINE_2 = "Waiting for";
	public static final String SIGN_FORMAT_INACTIVE_LINE_3 = "server...";
	public static final String SIGN_FORMAT_INACTIVE_LINE_4 = "";
	
	public static final String[] SIGN_FORMAT_INACTIVE = {
		
		SIGN_FORMAT_INACTIVE_LINE_1, 
		SIGN_FORMAT_INACTIVE_LINE_2, 
		SIGN_FORMAT_INACTIVE_LINE_3, 
		SIGN_FORMAT_INACTIVE_LINE_4
		
	};
	
	public static final String SIGN_FORMAT_ACTIVE_LINE_1 = "<green>[JOIN]";
	public static final String SIGN_FORMAT_ACTIVE_LINE_2 = "%s";
	public static final String SIGN_FORMAT_ACTIVE_LINE_3 = "%s";
	public static final String SIGN_FORMAT_ACTIVE_LINE_4 = "%d/%d Players";
	
	public static final String[] SIGN_FORMAT_ACTIVE = {
		
		SIGN_FORMAT_ACTIVE_LINE_1, 
		SIGN_FORMAT_ACTIVE_LINE_2, 
		SIGN_FORMAT_ACTIVE_LINE_3, 
		SIGN_FORMAT_ACTIVE_LINE_4
		
	};
	
	public static final String SIGN_FORMAT_INPROGRESS_LINE_1 = "<red>[INPROGRESS]";
	public static final String SIGN_FORMAT_INPROGRESS_LINE_2 = "%s";
	public static final String SIGN_FORMAT_INPROGRESS_LINE_3 = "%s";
	public static final String SIGN_FORMAT_INPROGRESS_LINE_4 = "%d/%d Players";
	
	public static final String[] SIGN_FORMAT_INPROGRESS = {
		
		SIGN_FORMAT_INPROGRESS_LINE_1, 
		SIGN_FORMAT_INPROGRESS_LINE_2, 
		SIGN_FORMAT_INPROGRESS_LINE_3, 
		SIGN_FORMAT_INPROGRESS_LINE_4
		
	};

}
