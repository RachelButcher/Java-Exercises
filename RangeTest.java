public class RangeTest {
	public static void main (String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = 0;

		if (a > b) {
		System.out.println("Error, the second value is not greater than the first");
		}
		for(int count = a; count <= b ; count++) {
			sum = sum + count;
		}

		System.out.println(sum);
	}
}