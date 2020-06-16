/**
*This program computes the circumference and area of a 
*circle when a radius is given from the command line
*@author Rachel Butcher
*@version 02/10/19
*/
public class MyCircle {
/**
*The main method converts a string from the command line 
*into a double for performing area and circumference 
*calculations. These calculations are then printed. 
*@param args a String containing command line arguments
*/
	public static void main (String args []) {
		double radius = Double.parseDouble (args[0]);

		System.out.println("The radius of the circle is " + args[0] + " cm");	
		
		double PI = 3.1415926;		
		double circumference = (2 * PI * radius);
			System.out.println("Its circumference is " + circumference + " cm");
//print superscript 2 using "\u00B2"
		double area = (4 * PI * (radius * radius));
			System.out.println("And its area is " + area + " cm\u00B2"); 
	}
}

