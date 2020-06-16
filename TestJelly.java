/**
*The program creates one red jelly and one blue jelly and determines 
*whether they are alive or dead depending on their health value.
*@author Rachel Butcher
*@version 20/11/19
*/
public class TestJelly {
	/**
	*The main method creates new instance of red and blue jelly and calls
	*the isAlive() method
	*@param args this is not used
	*/
	public static void main(String[] args) {

	BlueJelly blueJelly = new BlueJelly(400,0);
	RedJelly redJelly = new RedJelly(0,1);

	System.out.println("Is " + redJelly.name + " alive? " + redJelly.isAlive()); 
	System.out.println("Is " + blueJelly.name + " alive? " + blueJelly.isAlive());
	}
}

