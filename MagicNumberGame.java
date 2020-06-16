/**
*This is part of a program that asks the player to guess a randomly 
*generated number between 1-100. The game will continue until the 
*correct number is entered, then print the number of guesses the player made.
*@author Rachel Butcher
*@version 16/10/19
*/
import java.util.Random;

public class MagicNumberGame {
/**
*This method generates a random number between 1-100 and compares it 
*to the players guess. The method will print if the guess is too
*high or too low, and repeat until the correct guess is entered.
*/
	public void magicGame() {
//Creates new object called 'rand' using the Random() method
	Random rand = new Random();

//Sets the limit of the rand object to 1-100 (or 0-99 + 1) and stores in the variable 'magicNumber' 
	int magicNumber = rand.nextInt((100) + 1);
//Creates a count variable that will increment each guess attempt
	int count = 0;
//Creates a boolean condition for whether the loop condition is true
	boolean win = true;

//While the boolean condition is true, method will continue to loop
	while (win) {
	count++;

//Creates player object and stores input guess constructor from MagicPlayer class
		Player player = new Player();
		int playerGuess =  player.guess();

		if (playerGuess == magicNumber) {
			win = false;
		}
		if (playerGuess > magicNumber) {
			System.out.println("Guess is too high");
			win = true;
	
		} else if (playerGuess < magicNumber) {
			System.out.println("Guess is too low");
			win = true;
			}
		}
	System.out.println("Bingo");
	System.out.println("You took " + count + " attempts");
	}
}
	