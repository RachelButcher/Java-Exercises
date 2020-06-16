 /**
 *This program prints the month that corresponds with a given
 *number
 *@author Rachel Butcher
 *@version 02/10/19
 */

 public class MonthConverter {
 /**
 *The method converts a string value between 1 and 12, from
 *the command line, into an integer and prints the corresponding
 *month 
 *@param args a String containing command line arguments
 */
	public static void main (String args[]) {
		int month = Integer.parseInt(args[0]);
		if (month == 1) {
			System.out.println("Month 1 is January");
		} else if (month == 2) {
			System.out.println("Month 2 is February");
		} else if (month == 3) {
			System.out.println("Month 3 is March");
		} else if (month == 4) {
			System.out.println("Month 4 is April");
		} else if (month == 5) {
			System.out.println("Month 5 is May");
		} else if (month == 6) {
			System.out.println("Month 6 is June");
		} else if (month == 7) {
			System.out.println("Month 7 is July");
		} else if (month == 8) {
			System.out.println("Month 8 is August");
		} else if (month == 9) {
			System.out.println("Month 9 is September");
		} else if (month == 10) {
			System.out.println("Month 10 is October");
		} else if (month == 11) {
			System.out.println("Month 11 is November");
		} else if (month == 12) {
			System.out.println("Month 12 is December");
		}
	}
}
		
