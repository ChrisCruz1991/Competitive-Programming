import java.util.Scanner;
public class CountingOnes {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		int rangeA;
		int rangeB;
		int count;
		String binary;
		
		while (cases --> 0) {
			rangeA = kb.nextInt();
			rangeB = kb.nextInt();
			count = 0;
			
			for (int i = rangeA; i <= rangeB; i++) {
				binary = Integer.toBinaryString(rangeA);
			}
		}
		kb.close();

	}

}
