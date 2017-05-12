import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Account_Balance {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, b, t, amount;
		String letter, input;
		StringTokenizer token;
		
		n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			b=0;
			b=Integer.parseInt(br.readLine());
			t=Integer.parseInt(br.readLine());
			for(int j=0;j<t;t++){
				input = br.readLine();
				token = new StringTokenizer(input);
				letter = token.nextToken();
				amount = Integer.parseInt(token.nextToken());
				
				if(letter.equals("C"))
					b += amount;
				else if(letter.equals("D"))
					b -= amount;
			}
			System.out.println(b);
		}
	}

}
