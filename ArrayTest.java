/**
*This program creates an Array of Strings containing name, gender and email
*address
*@author Rachel Butcher
*@version 13/11/19
*/

public class ArrayTest {
	/**
	*The main method creates an array ('details') of Strings, size 3, and sets elements as
	*name, gender and email. For loop iterates through array and prints each element
	*@param args parameter not used
	*/
	public static void main (String[] args) {
	
	String[] details = new String[3];
	
	details[0] = "Rachel";
	details[1] = "Female";
	details[2] = "ec19652@qmul.ac.uk";
	
	for(int i = 0; i < details.length; i++) {
		System.out.println(details[i]);
		}
	}
}
