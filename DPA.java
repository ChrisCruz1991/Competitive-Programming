import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DPA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test, number, multiple, totalMultiple;
		
		test = Integer.parseInt(br.readLine());
		for(int i = 0; i < test; i++){
			totalMultiple = 0;
			number = Integer.parseInt(br.readLine());
			for(multiple = 1; multiple < number; multiple++){
				if(number % multiple == 0){
					totalMultiple += multiple;
				}
			}
			if(totalMultiple < number)
				System.out.println("Deficient");
			else if(totalMultiple == number)
				System.out.println("Perfect");
			else
				System.out.println("Abundant");
		}
	}

}
