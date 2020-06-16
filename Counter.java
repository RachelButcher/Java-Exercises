/**
*This program creates a simple counter
*@author Rachel Butcher
*@version 23/10/19
*/ 
public class Counter {
//Private attributes are defined
	private int count;
	private int max;
	
//Default constructor is created
	public Counter() {
		count = 0;
		max = 10;
	}
/**
*Method for accessing private variable count.
*@return count
*/
	public int getCount() {
		return count;
	}
/**
*Method for setting instance of count to the value of n 
*as specified in CounterTest main method
*@param n value of count
*/
	public void setCount(int n) {
		this.count = n;
	}
/**
*Method for accessing private variable max.
*@return max
*/
	public int getMax() {
		return max;
	}
/**
*Method for setting instance of max to the value of n 
*as specified in CounterTest main method
*@param n value of count
*/
	public void setMax(int n) {
		this.max = n;
	}
/**
*Method for increasing the value of count by 1, on the condition that the count is less than max. 
*If the value of count reaches max, it will reset to 0
*/
	public String increase() {
		if (this.count < max) {
			this.count += 1;
		}
		else this.count = 0;
		return("Max reached, counter reset");
	}
/**
*Method for decreasing the value of count by 1, on the condition that the count is greater that 0.
*Value will not decrease below 0.
*/
	public void decrease() {
		if (this.count > 0) {
			this.count -= 1;
		}
	}
/**
*Method for resetting the counter to zero and printing out reset String 
*@return String Print counter reset statement
*/
	public String reset() {
		this.count = 0;
		return("Counter reset");
	}

/**
*Method for returning the String representation of count
*@return String the value of count and max when the method is called 
*/
	public String toString() {
		return ("Count: " + count + "," + " " + "Max: " + max);
	}

/**
*Method for increasing value of count by n
*/
	public void increase(int n) {
		this.count += n;
		}
/**
*Method for decreasing the value of count by n
*/
	public void decrease(int n) {
		this.count -= n;
	}
}
