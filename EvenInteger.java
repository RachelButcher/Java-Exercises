import java.util.Scanner;

public class EvenInteger {
	public static void main (String args[]) {

	int number; 
	System.out.println("Enter an even integer value");

	Scanner input = new Scanner(System.in);

	while (!input.hasNextInt() || (input.nextInt() % 2 != 0)) {

	if (!input.hasNextInt()) {
		System.out.println("Error: the value is not an integer, enter an integer");
		input.next();
	}

	if (input.nextInt() % 2 != 0) {
		System.out.println("Error: the value is not even, enter an even integer value");
		input.next(); 
	}
	System.out.println("Thank you");
	}
	System.out.println("Thank you");
	}	
}