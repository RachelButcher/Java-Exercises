/**
*The class has an array attribute that holds seven double values representing
*individual marks on seven assignments
*@author Rachel Butcher
*@version 13/11/19
*/
public class StudentMarks2 {

	private double[] marks = new double[7];
	private int pos;
	private double mark;

	/**
	*Method for accessing the array
	*@return marks array
	*/
	public double[] getMarks() {
		return marks;
	}
	/**
	*Method for accessing the position of the mark in the array
	*@return pos 
	*/
	public double getMark(int pos) {
		return pos;
	}
	/**
	*Method for setting the marks for individual assignments at a given
	*position
	*/
	public void setMark(int pos, double mark) {
		this.pos = pos;
		this.mark = mark;
	}
	/**
	*Method for calculating the mean of the marks of the assignments
	*@return mean
	*/
	public double calMean(){
		double sum = 0;
		double mean = 0;
	
	for(int i = 0; i < marks.length; i++) {
		sum = sum + marks[i];
		mean = ((double)sum / (double)marks.length);
	}
		return mean;
	}
	/**
	*Method for determining the position of the highest mark of the assignments
	*@return pos The index of the max element 
	*/
	public double maxIndex(double[] marks) {
		double maximum = marks[0];

		for(int i = 0; i < marks.length; i++) {
			if (marks[i] > maximum) {
				maximum = marks[i];
				pos = i;
			}
		}
		return pos;
	}
	/**
	*Method for determining the position of the second mark, in the event of 
	*an array with two equal highest marks
	*@return pos The index of the second max element
	*/
	public double secondMaxIndex(double[] marks) {
		double maximum = marks[0];

		for(int i = 0; i < marks.length; i++) {
			if (marks[i] >= maximum) {
				maximum = marks[i];
				pos = i;
			}
		}
		return pos;
	} 
}

