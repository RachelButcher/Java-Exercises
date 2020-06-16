/**
*Class represents the Blue Jelly and is extension of Jelly Super class
*@author Rachel Butcher
*@version 20/11/19
*/
public class BlueJelly extends JellySuper {
	/**
	*Constructor to set health and type of jelly, referencing Jelly Super class
	*/
	public BlueJelly(int health, int type){
		super(health, BLUE_JELLY);
	}
	/**
	*Constructor sets jelly type, referencing Jelly Super class 
	*/
	public BlueJelly(int type){
		super(BLUE_JELLY);
	} 
}


