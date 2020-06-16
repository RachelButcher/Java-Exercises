/**
*This program takes a sentence from user input, removes all 
*non letters(numbers, punctuation, spaces, tabs), reverses 
*it and changes the case of each letter
*@author Rachel Butcher
*/
import java.util.Scanner;

public class reverseString {
	public static void main (String[] args) {
/**
*Method reads a string from the command line
*/
		Scanner sc = new Scanner(System.in);

		System.out.print("Input a string ");
		String s = sc.nextLine();
/**
*Method removes all non alphabetic characters, including
* whitespace, using regex
*/
		String replace = s.replaceAll("[^a-zA-Z]", "");

		String r = "";

		for (int i = replace.length()-1; i >= 0; i--) {
				char c = replace.charAt(i);
			if (Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			} else if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}
			r = r + c;
		}
		System.out.println(r);
	}
}

