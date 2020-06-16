/**
*The program creates an ArrayList of different colour towers; and sets and prints 
*their level
*@author Rachel Butcher
*@version 30/11/19
*/
import java.util.ArrayList;

public class TowerTest {
	/**
	*The main method creates a new ArrayList and adds different towers 
	*The increaselevel() method is called on each new instance of tower classes
	*to set the level.
	* For loop iterates through ArrayList and prints elements as strings
	*/
	public static void main (String[] args){
		ArrayList<Tower> towerList = new ArrayList<Tower>();
		towerList.add(new Tower());
		towerList.add(new BlueRedTower());
		BlueTower blueTower1 = new BlueTower();
		blueTower1.increaseLevel();
		towerList.add(blueTower1);
		BlueTower blueTower2 = new BlueTower();
		blueTower2.increaseLevel(); 
		blueTower2.increaseLevel();
		blueTower2.increaseLevel();
		towerList.add(blueTower2);
		towerList.add(new RedTower());
		
		for (Tower t: towerList) System.out.println(t);
	}
}
