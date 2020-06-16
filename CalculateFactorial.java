public class CalculateFactorial{
	public static void main (String[] args){
		int input = Integer.parseInt(args[0]);
		int fact = 1;

		for (int i = 1; i <= input; i++){
			fact = fact * i;
		}
		System.out.println ("The factorial of " +input +" is " +fact);
	}
}



