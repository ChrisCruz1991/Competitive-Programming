import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Div_5{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		String number;	
		for (int i = 0; i < test; i++) {
			number = br.readLine();
			if (number.charAt(number.length() - 1) == '5' ||
					number.charAt(number.length() - 1) == '0')
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		br.close();
	}
}