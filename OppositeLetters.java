/**
*This program takes a sentence from user input, removes all non-letters
*reverses it and changes the case of every letter.
*@author Rachel Butcher
*@version 16/10/19
*/
import java.util.Scanner;

public class OppositeLetters {
/**
*The main method requests a String from the command line, replaces
*all non alphabetic characters and whitespace with "" and prints
*a new String constructed with the reversed, inverted case characters
*of the alphabetic String
*@param args The program does not use this parameter
*/
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Input a string ");
		String inputString = sc.nextLine();

//Remove all non alphabetic characters and whitespace
		String replace = inputString.replaceAll("[^a-zA-Z]", "");
//Create empty String and populate with the characters of the 
//replace String, by initializing at the last letter and iterating 
//backwards
		String invertCase = "";

		for(int i = replace.length()-1; i>=0; i--) {
//Invert the case of each character
			char c = replace.charAt(i);
			if(Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);

			} else if (Character.isLowerCase(c)){
				c = Character.toUpperCase(c);
			}
//Populate empty string with reversed, case inverted characters
		invertCase = invertCase + c;
	}
		System.out.println(invertCase);
	}
}

	
	
	
