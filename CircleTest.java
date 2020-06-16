/**
 *This program creates circles of chosen radius (between 1-4)
 *and colour (red, blue, orange or yellow)
 *@author Rachel Butcher
 *@version 23/10/19
 */
public class CircleTest {
/**
*The main method creates new instances of circles and calls the 
*setColour and setRadius methods from the Circle class.
*@param col the colour of the circle
*@param args this program does not use this parameter
*/
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setColour("orange");
		c.setRadius(3);
		Circle c2 = new Circle();
		c2.setColour("blue");
		c2.setRadius(1);
		Circle c3 = new Circle();
		
		Circle c4 = new Circle();
		c4.setColour("red");
		c4.setRadius(1);
		Circle c5 = new Circle();
		c5.setColour("blue");
		c5.setRadius(2);
		Circle c6 = new Circle();
		c6.setColour("orange");
		c6.setRadius(1);
		Circle c7 = new Circle();
		c7.setColour("yellow");
		c7.setRadius(4);
		
		
		//ALL ADDED CODE MUST BE ABOVE THIS LINE
		Circle.displayMyCircles();
	}

}
