public class MultiplicationTable {
	public static void main (String[] args) {
		int tableSize = 9;
		
		for (int i = 1; i<= tableSize; i++) {

			for (int j = 1; j <= tableSize; j++) {
				int length = String.valueOf(i*j).length();
				if (length == 1) {
					System.out.print(" " + i*j + " ");
				}
				else {
					System.out.print(i*j + " ");
				}
			}
		System.out.println();
		}
	}
}
	
	