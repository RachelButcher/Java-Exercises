/**
*Super class defines the name, type and health of Jelly. Also contains method
*for determining whether the Jelly is alive
*@author Rachel Butcher
*@version 20/11/19
*/
public class JellySuper {
	public static final int BLUE_JELLY = 0;
	public static final int RED_JELLY = 1;

	protected int type;
	protected int health;
	protected String name;
	/**
	*Super constructor for initializing jelly health, type and name
	*Applies healthControl method to jelly health
	*/
	public JellySuper(int health, int type) {
		this.health = health;
		this.healthControl();
		this.type = type;
	//sets name of BLUE_JELLY type to 'blue jelly' etc.
	if(type == BLUE_JELLY){
		this.name = "Blue Jelly";
	}else if(type == RED_JELLY){
		this.name = "Red Jelly";
		}	
	}
	/**
	*Super constructor for setting type and name of jelly
	*/
	public JellySuper(int type) {
		this.health = health;
		this.type = type;
	
		if(type == BLUE_JELLY){
			this.name = "Blue Jelly";
		}else if(type == RED_JELLY){
			this.name = "Red Jelly";
		}
	}
	/**
	*Method constrains health to between 0-100
	*@return heath
	*/
	public int healthControl() {
		if (this.health > 100) {
			this.health = 100;
		} else if (this.health < 0) {
			this.health = 0;
		} else {
			this.health = this.health;
		}
		return this.health;
	}
	/**
	*Method determines whether jelly is alive (health = 1-100) or dead (health = 0)
	*@return true or false 
	*/
	public boolean isAlive() {
		if (this.health <= 0) {
			return false;
		} else {
			return true;
		}	
	}
}

