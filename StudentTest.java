/**
*The program takes the details of two students and prints that
*they have been registered
*@author Rachel Butcher
*@version 23/10/19
*/
public class StudentTest {
/**
*The main method creates two new instances of students and sets the
*values of the attributes called from the Student class. The name of 
*each student is printed and the register() method is called.
*@param args the program does not use this parameter
*/
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.name = "Rick Sanchez";
		student1.gender = "Male";
		student1.yearOfBirth = 1972;

		Student student2 = new Student();
		student2.name = "Rachel Butcher";
		student2.gender = "Female";
		student2.yearOfBirth = 1997;
		
		System.out.println(student1.name);
		System.out.println(student1.register());

		System.out.println(student2.name);
		System.out.println(student2.register());
	}
}
