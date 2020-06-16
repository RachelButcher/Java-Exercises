/**
*This program calculates the absolute difference between two
*positive doubles, or prints the positive equivalent if the number
*given is negative.
*@author Rachel Butcher
*@version 16/10/19
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Positive {
/**
*The main method accepts a double from the command line. If the value
*is positive (n>0), a second double is requested and the positive 
*difference is calculated. If the first double is negative (n<0), the method
*prints the positive transformation. A custom input mismatch exception message is thrown 
*if a non number is entered.
*@param args The program does not use this parameter
*@exception InputMismatchException if input is not a number
*/
	public static void main (String[] args) {

//create new object of Scanner class and store in the variable sc
	Scanner sc = new Scanner(System.in);

	try {
//Statements below are tried for exceptions
	System.out.print("Input a double: ");
	double firstInput = sc.nextDouble();
	
	if (firstInput > 0) {
		System.out.print("Input another double: ");
		double secondInput = sc.nextDouble();

//Creates a new decimal format to round to 1 decimal place
		DecimalFormat df = new DecimalFormat("#.#");
//df.format calls new decimal format
//Math.abs() returns the absolute value of a number
		System.out.println(df.format(Math.abs(firstInput - secondInput)));
		}
	else if (firstInput < 0) {
		System.out.println(Math.abs(firstInput));
		}
//Catch mismatch exception and throw custom message
	} catch (InputMismatchException e) {
		System.out.println("Error: input is not an number");
		}
	}
}