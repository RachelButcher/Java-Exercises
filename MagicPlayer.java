/**
*This is part of a program that asks the player to guess a randomly 
*generated number between 1-100. The game will continue until the 
*correct number is entered, then print the number of guesses the player made.
*@author Rachel Butcher
*@version 16/10/19
*/
import java.util.Scanner;

public class MagicPlayer {
/**
*The method asks the player to guess a number between 1-100
*and returns it to the MagicNumberGame class.
*@return guess the input of the player
*/
	public int guess() {

//Creates a new Scanner object and stores the variable in 'sc'
	Scanner sc = new Scanner(System.in);

//Reads an input from the command line, use nextInt() method to parse input into an
//integer variable called 'guess'
	System.out.print("Guess a number between 1 and 100: ");
	int guess = sc.nextInt();
//Return the guess variable to the magicGame method
	return guess;
	}
}