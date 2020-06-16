/**
*This program creates an array of seven marks, as set by the user, and calculates
*the mean and highest values.
*@author Rachel Butcher
*@version 13/11/19
*/
import java.util.Scanner;
import java.util.Arrays;

public class StudentMarksMain2 {
	/**
	*The main method creates an instance of the Student Marks class and marks array
	*Each mark is set by the user using a for loop, then added to the array
	*Mean and Max methods are called from Student Marks class
	*@param args Input using scanner
	*/
	public static void main (String[] args) {
 
	Scanner input = new Scanner(System.in);

	StudentMarks2 newStudent = new StudentMarks2();

	double[] newArray = newStudent.getMarks();

	for(int i = 0; i < 7; i++) {
		System.out.println("Enter the student mark");
			
			double marks = input.nextDouble();
			newArray[i] = marks;
	}
	
	System.out.println("The mean of the marks is " + newStudent.calMean());
	System.out.println("The position of the first highest mark is " + newStudent.maxIndex(newArray));
	System.out.println("The position of the second highest mark is " + newStudent.secondMaxIndex(newArray));
	}
}	

