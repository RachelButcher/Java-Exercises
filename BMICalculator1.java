/**
*This program calculates BMI and gives a weight status.
*@author Rachel Butcher
*/
import java.text.DecimalFormat;
/**
*The main method accepts two inputs from the command line,
* calculates the BMI and prints the corresponding weight status
*@param args a String containing command line arguments 
*/
public class BMICalculator1 {
	public static void main (String args []) {

	double weight = Double.parseDouble(args[0]);
	double height = Double.parseDouble(args[1]);

	System.out.println("Your weight: " + weight + "kg");
	System.out.println("Your height: " + height + "cm");
	
	DecimalFormat format = new DecimalFormat ("##.00");
	double BMI = (weight / ((height/100)*(height/100)));
	System.out.println("Your BMI: " + (format.format(BMI))); 
	
	if (BMI < 18.5) {
		System.out.println("You are in the underweight range");
	} else if (BMI < 25) {
		System.out.println("You are in the normal range");
	} else if (BMI < 30) {
		System.out.println("You are in the overweight range");
	} else if (BMI > 30) {	
		System.out.println("You are in the obese range");
	}

	}	

}

