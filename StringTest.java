/**
*This program demonstrates some of the methods on String
*operations from the String and Scanner classes
*@author Rachel Butcher
*@version 16/10/19
*/
import java.util.Scanner;

public class StringTest {
/**
*The main method reads a String from the command line and prints
*out the following: the String, the length of the String, 
*change all letters to uppercase, change all letters to lowercase
*the first character, the last character, remove all white space
*@param args The program does not use this parameter
*/
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.print("Input a string ");
	String inputString = sc.nextLine();

	String string = inputString.toString();
	int length = inputString.length();	
	String sUpper = inputString.toUpperCase();
	String sLower = inputString.toLowerCase();
	char firstLetter = inputString.charAt(0);
	char lastLetter = inputString.charAt(inputString.length()-1);
	String replace = inputString.replace(" ","");
	
	System.out.println("1. " + string);
	System.out.println("2. " + length);
	System.out.println("3. " + sUpper);
	System.out.println("4. " + sLower);
	System.out.println("5. " + firstLetter);
	System.out.println("6. " + lastLetter);
	System.out.println("7. " + replace);	
	}
}

	
	
