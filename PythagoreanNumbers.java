import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PythagoreanNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int a,b,c;

		while(true){
			input = br.readLine();
			if(input.equals("0"))
				break;

			StringTokenizer token = new StringTokenizer(input);

			a=Integer.parseInt(token.nextToken());
			b=Integer.parseInt(token.nextToken());
			c=Integer.parseInt(token.nextToken());

			if((int)Math.pow(a, 2) + (int)Math.pow(b, 2) == (int)Math.pow(c, 2))
				System.out.println("right");
			else if((int)Math.pow(a, 2) + (int)Math.pow(c, 2) == (int)Math.pow(b, 2))
				System.out.println("right");
			else if((int)Math.pow(b, 2) + (int)Math.pow(c, 2) == (int)Math.pow(a, 2))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
