/**
*This program creates a simple counter
*@author Rachel Butcher
*@version 23/10/19
*/ 
public class CounterTest {
/**
*The main method creates a new counter instance and calls
*each method created in the Counter class
*@param args the program does not use this parameter
*/
	public static void main (String[] args){

	Counter count1 = new Counter();
//Sets the values of count and max for the new instance
		count1.setCount(5);
		count1.setMax(10);
//Prints out the value of count and max
	System.out.println("Count: " + count1.getCount());
	System.out.println("Max: " + count1.getMax());
	
//Invokes the increase() decrease() reset() and toString methods
		count1.increase();
	System.out.println("Increase by 1: " + count1.getCount());
		count1.decrease();
	System.out.println("Decrease by 1: " + count1.getCount());
		count1.reset();
	System.out.println(count1.reset());
		count1.toString();
	System.out.println(count1.toString());

//Iterates through increase() method until condition of i is met. 
//The value of getCount is printed after each loop
//If the value of count reaches the value of max, the counter is reset to zero
	for(int i = 1; i <= 25; i++) {
		count1.increase();
		System.out.println(count1.getCount());
		if (count1.getCount() == count1.getMax()) {
			System.out.println(count1.increase());
			}
		}
//Iterates through decrease() method until condition of i is met
//The value of getCount is printed for each loop
//If the value of count reaches zero, the reset() method is invoked and loop is exited
	for(int i = 1; i <= 5; i++) {
		count1.decrease();
		System.out.println(count1.getCount());
		if (count1.getCount() == 0) {
			count1.reset();
			System.out.println(count1.reset());
			break;
			}
		}
//Invokes increase(int n) and decrease(int n) methods 
		count1.increase(10);
	System.out.println("Increase by n: " + count1.getCount());
		count1.decrease(12);
	System.out.println("Decrease by n: " + count1.getCount());
         }
}

