/**
*This program asks the player to guess a randomly generated number
*between 1-100. The game will continue until the correct number is 
*entered, then print the number of guesses the player made.
*@author Rachel Butcher
*@version 16/10/19
*/
public class MagicMain {
/**
*The main method creates a new instance of the MagicNumberGame class
*and calls the magicGame method
*@param args The program does not use this parameter
*/
	public static void main (String[] args) {
		
//create instance of MagicNumberGame class and calls magicGame method
	MagicNumberGame game1 = new MagicNumberGame();
	game1.magicGame();
	}
}