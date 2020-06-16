/**
*This program creates an ArrayList of students
*@author Rachel Butcher
*@version 13/11/19
*/
import java.util.ArrayList;

/**
 *A class that holds the list of student
 */
public class StudentList {

	private ArrayList<Student> list; //instance variable

	/**
	 * Constructor
	 */
	public StudentList(){
		list = new ArrayList<Student>();
	}
	
	/**
	 * Method iterates through ArrayList and prints the element at each 
	 *index
	 */
	
	public void printList(){
		System.out.println("--Begin--");
		
		for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
		}

		System.out.println("--End--");
	}
	
	/**
	 *Method adds a new student to the ArrayList
	 *@param s student
	 */
	public void addToList(Student s){
	
		list.add(s);
		System.out.println(s.getName() + " has been added to the student list");
	}

	/**
	 *Method removes a student from the ArrayList
	 *@param s student
	 */
	public void removeFromList(Student s){
		
		list.remove(s);
		System.out.println(s.getName() + " has been removed from the student list");
	}
	
	/**
	 *The main method tests the methods of the class
	 */
	public static void main(String[] args) {

		// Create an instance of the class 
		StudentList studentList = new StudentList();

		//create 3 student objects
		Student s1 = new Student("John Smith", "js@qmul.ac.uk", 2008);
		Student s2 = new Student("Tom Will", "tw@qmul.ac.uk", 2007);
		Student s3 = new Student("Rachel Butcher", "ec19652@qmul.ac.uk", 2019);
		
		//add the three students to the list
		studentList.addToList(s1);
		studentList.addToList(s2);
		studentList.addToList(s3);

		// Print the list
		studentList.printList();
			
		// Remove the student "Tom Will"
		studentList.removeFromList(s2);
		
		// Print the list again
		studentList.printList();
	}

}
