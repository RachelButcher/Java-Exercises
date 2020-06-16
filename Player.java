import java.util.Scanner;

public class Player {
	public int guess() {

//create new Scanner object and store the variable in 'sc'
	Scanner sc = new Scanner(System.in);

//read input from the command line, use nextInt() method to parse input into an
//integer variable called 'guess'
	System.out.print("Guess a number between 1 and 100: ");
	int guess = sc.nextInt();
//return guess variable to main method
	return guess;
	}
}