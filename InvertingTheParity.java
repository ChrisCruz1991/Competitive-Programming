import java.util.Scanner;
public class InvertingTheParity {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();

		while (test-- > 0) {
			int number = kb.nextInt();

			if (number % 2 != 0)
				System.out.println(number *= 2);

			else {
				while (number % 2 == 0)
					number /= 2;
				System.out.println(number);
			}
		}
		kb.close();
	}

}
