/**
*This program creates an ArrayList of Strings containing name, gender and email
*address
*@author Rachel Butcher
*@version 13/11/19
*/
import java.util.ArrayList;

public class ArrayListTest {
	public static void main (String[] args) {
	/**
	*The main method creates an ArrayList ('details') of Strings, size 3, and sets elements as
	*name, gender and email. For loop iterates through array and prints each element
	*@param args parameter not used
	*/
	ArrayList<String> details = new ArrayList<String>();
	
	details.add("Rachel");
	details.add("Female");
	details.add("ec19652@qmul.ac.uk");

	for(int i = 0; i < details.size(); i++) {
		System.out.println(details.get(i));	
		}	
	}
}
