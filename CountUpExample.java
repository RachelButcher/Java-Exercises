/** 
 * This is my first properly documented piece java code.
 * When the javadoc tool is run over this code, it will 
 * HTML maintenance manual.
 * @author Rachel Butcher
 * @version 1.0
 */
public class CountUpExample {

      /** 
       * This method counts up from a specified number
       * to zero. It will print its progress to the 
       * command line.
       * @param count The number to count from.
       * Renamed method to CountupExample and changed final print line to 'All Done!'
       */
	public void countUp(int count) {
	    /* Note: if there are no brackets after a for 
             * loop it is only the the sentance that 
             * immediatly follows that is part of the loop 
             * Changed increment to i++, changed start (int i) to 0 and set condition to whilst
             * i is less than or equal to the input
             */
		for (int i = 0; i <= count; i++) 
			System.out.println(i);
		
		System.out.println("\nAll done!");
	}

      /**
       * Main now only creates a new instance of my 
       * program and calls the program's method.
       * @param args This program does not use this parameter.	
       * Set variables CountUpExample q = new CountUpExample	
       */
	public static void main (String[] args) {
	    CountUpExample q = new CountUpExample();
            q.countUp(5);
	}
}
