import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class EvenOrOdd {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		BigInteger numbers;
		BigInteger constant = new BigInteger("2");
		
		for(int i=0;i<testCases;i++){
			numbers = new BigInteger(br.readLine());
			if(numbers.mod(constant).toString().equals("0"))
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}

}
