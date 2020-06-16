/**
*Super class Tower contains constructor for setting the level and name
*Holds method for moving up a level
*@author Rachel Butcher
*@version 30/11/19
*/
public class Tower {
	public static final int LEVEL_1 = 1;
	public static final int LEVEL_2 = 2;
	public static final int LEVEL_3 = 3;
	public static final int LEVEL_4 = 4;
	
	protected int level;
	protected String name;
	/**
	*Constructor initializes level at 1 and name to 'generic tower'
	*/
	public Tower(){
		this.level = LEVEL_1;
		name = "Generic Tower";
	}
	/**
	*Method for moving to the next level
	*/
	public void increaseLevel(){
		if (this.level != LEVEL_4) this.level++;
		else System.out.println("Tower at maximum level");
	}
	/**
	*Method for returning the given string 
	*@return string
	*/
	public String toString() {
		return (this.name + " : Level " + this.level);
	}

}
