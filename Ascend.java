// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		// random numbers
		int a = (int)(Math.random() * range);
		int b = (int)(Math.random() * range);
		int c = (int)(Math.random() * range);

		//calculate num
		int min = Math.min(c, Math.min(a, b));
		int max = Math.max(c, Math.max(a, b));
		int mid = (a + b + c) - (min + max);
		System.out.println(range);
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);

	}
}
