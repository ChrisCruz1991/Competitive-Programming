import java.util.Scanner;


public class DistanceOfManhattan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int test, x1, x2, y1, y2, distance = 0;
		
		test = kb.nextInt();
		
		for(int i = 0; i < test; i++) {
			x1 = kb.nextInt();
			y1 = kb.nextInt();
			x2 = kb.nextInt();
			y2 = kb.nextInt();
			distance = Math.abs(x2-x1)+ Math.abs(y2-y1);
			
			System.out.println(distance);
			
		}

	}
}