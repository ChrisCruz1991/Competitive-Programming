import java.util.Scanner;

public class AnotherCandies {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int test, children, candies, total;
		test = kbd.nextInt();
		
		for (int t = 0; t < test; t++) {
			children = kbd.nextInt();
			total = 0;
			
			for (t = 0; t < children; t++) {
				candies = kbd.nextInt();
				total += candies;
			}
			if (total % children != 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
