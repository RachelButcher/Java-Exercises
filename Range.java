/**
*This program calculates the sum of integers in a 
*given range
*@author Rachel Butcher
*@version 09/10/19
*/
public class Range {
/**
*The main method accepts two values from the
*command line and calculates the sum of the integers in
*the given range. An error message is printed if the second
*value not greater than the first.
*@param args a String containing command line arguments
*/
	public static void main (String[] args){
		int startRange = Integer.parseInt(args[0]);
		int endRange = Integer.parseInt(args[1]);
		int sum = 0;
//the for-loop iterates through the range, adding each consecutive
//value to the sum of the previous values
		if (startRange < endRange) {
			for(int i = startRange; i <= endRange ; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
			}
		else {
			System.out.println("Error, the second value is not greater than the first");
		}
	}
}	




		
