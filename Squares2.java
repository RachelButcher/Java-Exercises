/**
*This program prints the square of each numerical digit.
*@author Rachel Butcher
*@version 09/10/19
*/
public class Squares2 {
/**
*The main method is initialized at 1 and increments by 1 for
*each iteration whilst i is less than 10. For each iteration
*the respective square number is printed. 
*@param args this program does not use this parameter
*/
	public static void main (String[] args){
		
		for (int i = 1; i<10; i++) {
			System.out.println("The square of " + i + " is "+ i * i);
		}
	}
} 
