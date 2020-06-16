import java.util.Scanner;

public class HelloScanner {

	public static boolean checkLength(String str) {
		int length = str.length();
		if (length > 3) {
			return true;
		}
		else
		{
			return false;
		}  
	}

	public static boolean checkEmail(String str) {
		int char1 = str.indexOf('@');
		int char2 = str.indexOf('.');

		if (char1 != -1 || char2 != -1){

			return true;
		}
		else
		{
			return false;
		}  
	}
	
	public static void main (String args[]) {

	//Create a Scanner object
	Scanner reader = new Scanner(System.in);

	//Read first name
	System.out.print("Enter your first name: ");
	String first = reader.next();
	
	if (first.checkLength()) {
		//Read last name
		System.out.print("Enter your last name: ");
		String last = reader.next();
	}

	if (last.checkLength()) {
		//Read e-mail
		System.out.print("Enter your e-mail: ");
		String email = reader.next();
	}
	
	if (email.checkEmail()) {
		System.out.println("Hi " + first + "!");
		System.out.println("Your e-mail address is: " + email + ".");
	}
    }
}

