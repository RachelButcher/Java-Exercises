/**
*Class represents the Red Jelly and is extension of Jelly Super class
*@author Rachel Butcher
*@version 20/11/19
*/
public class RedJelly extends JellySuper {
	/**
	*Constructor to set health and type of jelly, referencing Jelly Super class
	*/
	public RedJelly(int health, int type){
		super(health, RED_JELLY);
	}
	/**
	*Constructor sets jelly type, referencing Jelly Super class
	*/
	public RedJelly(int type){
		super(RED_JELLY);
	}
}
