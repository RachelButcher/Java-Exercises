/**
*This program creates a number pyramid to the size of the 
*given input value
*@author Rachel Butcher
*@version 09/10/19
*/
public class PatternMethod {
/**
*The printPattern method uses a nested loop to fill rows of the 
*triangle with consecutive numbers, initialized at 1
*@param n an integer containing command line arguments
*/
	public static void printPattern (int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
		}
			System.out.println();
		}
	}
/**
*The main method calls the static method printPattern (no
*need to create new instance of the class)
*@param args This program does not use this parameter
*/
	public static void main (String[] args) {	
		int n = Integer.parseInt(args[0]);
		PatternMethod.printPattern(n);
	}
}	