/**
*This program creates a number pyramid to the size of 
*the given value
*@author Rachel Butcher
*@version 09/10/19
*/
public class Pattern{
/**
*The main method uses a nested loop to fill rows of the 
*triangle with consecutive numbers, initialized at 1
*@param args a String containing command line arguments
*/
	public static void main (String[] args){
		int pyramidSize = Integer.parseInt(args[0]);
//The outer loop determines the number of rows in the pyramid
//according to the given input
		for (int i = 1; i <= pyramidSize; i++) {
//The inner loop determines the number of values in each row
//according to the outer loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}	