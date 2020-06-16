/**
 *This program creates an Array of random values
 *@author Rachel Butcher
 *@version 13/11/19
 */
public class RandomArray {
	
	private int[] numbers; 
	/**
	 * Constructor
	 *@param  size  The size of the array
	 */
	public RandomArray(int size){
		numbers = new int[size];
		for(int i=0; i<numbers.length;i++){
			numbers[i] = (int)(Math.random()*10); // a random number between 0-9
		}
	}
	
	/**
	 *Method prints the elements of the array
	 */
	
	public void printArray(){
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	/**
	 * Method calculates the sum of all elements
	 *@return sum
	 */
	public int calSum(){
		int sum = 0;
	
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

	/**
	 *Method calculates the mean of all elements
	 *@return mean
	 */
	public double calMean(){
		
		return ((double) calSum() / (double)numbers.length);
		
	}
    
    /**
     *  a method to print the array elements in reverse order
     */
   // public void printReverse(); 
   // }
	
	/**
	 *The main method tests the methods created above
	 */
	public static void main(String[] args) {
		// Check to see if the user has actually sent a paramter to the method
		if (args.length != 1){
			System.out.println("Usage: java RandomArray <NUM>. Example: java RandomArray 5");
			System.exit(-1);
		}

		// Create an instance of the class 
		RandomArray test = new RandomArray(Integer.parseInt(args[0]));

		
		// Print the array
		test.printArray();
		
		// Calculate the sum of all the values in the array and print it
		//"\n" starts a new line
		System.out.println("\n" + "Sum: "+ test.calSum());
		
		// Calculate the mean of all the values in the array and print it
		System.out.println("Mean: "+ test.calMean());
        
       // System.out.print("Reverse: ");
      //  test.printReverse();
	}

}
