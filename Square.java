/**
*The programs prints the area of a sqaure given the length of the side
*@author Rachel Butcher
*@version 23/10/19
*/
public class Square{
//Attribute of Sqaure class defined
	public int x;
/**
*This method find the area of the square
*@return area integer found from the square of x
*/
	public int areaSquare() {
		int area = x * x;
		return area;
	}
/**
*The main method creates two new instances of squares and assigns
*values of x. The method then calls the areaSquare() method on the instances
*and prints this value.
*@param args the program does not use this parameter
*/
	public static void main(String[] args){
		Square square1 = new Square();
		square1.x = 10;
		
		Square square2 = new Square();
		square2.x = 35;
		
		System.out.println("The area of square 1 is " + square1.areaSquare());
		System.out.println("The area of square 2 is " + square2.areaSquare());
	}
}
