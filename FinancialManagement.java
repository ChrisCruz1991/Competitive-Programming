import java.util.Scanner;
public class FinancialManagement {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float cantidad = .0f;
		for(int i = 0; i < 12; i++){
			cantidad += kb.nextFloat();
		}
		cantidad /= 12.0f;
		System.out.printf("$%.2f", cantidad);
		kb.close();
	}

}