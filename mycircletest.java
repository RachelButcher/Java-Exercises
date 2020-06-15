import java.lang.Math.*;

public class MyCircle {
	public static void main (String args []) {
		
		double radius = Double.parseDouble (args[0]);

		System.out.println("The radius of the circle is " + args[0] + "cm");
		
		double circumference = (Math.PI * radius * 2);
		System.out.println("Its circumference is " + circumference + "cm");
		
		double area = (Math.PI * (radius * radius));
		System.out.println("And its area is " + area + "cm\u00B2");
	}
}

/* References: 
https://study.com/academy/lesson/how-to-use-pi-constant-in-java.html
https://stackoverflow.com/questions/32252832/java-how-to-insert-a-power-of-symbol
*/

//
import java.lang.Math.*;
import java.text.DecimalFormat;

public class MyCircle {
	public static void main (String args []) {
		
		double radius = Double.parseDouble (args[0]);

			System.out.println("The radius of the circle is " + args[0] + "cm");
		
		DecimalFormat format = new DecimalFormat ("###.00000");	

		double circumference = (Math.PI * radius * 2);
			System.out.println("Its circumference is " + (format.format(circumference)) + "cm");
		
		double area = (4 * Math.PI * (radius * radius));
			System.out.println("And its area is " + (format.format(area)) + "cm\u00B2"); 
	}
}

/* Reference:
https://javarevisited.blogspot.com/2012/03/how-to-format-decimal-number-in-java.html
*/

// 
import java.lang.Math.*;

public class MyCircle {
	public static void main (String args []) {
		
		double radius = Double.parseDouble (args[0]);

			System.out.println("The radius of the circle is " + args[0] + "cm");	
		
		double PI = 3.1415926;		

		double circumference = (PI * radius * 2);
			System.out.println("Its circumference is " + circumference + "cm");
		
		double area = (4 * PI * (radius * radius));
			System.out.println("And its area is " + area + "cm\u00B2"); 
	}
}

//