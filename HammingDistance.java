import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HammingDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string1;
		String string2;
		int count;
		while (true) {
			string1 = br.readLine();
			if (string1.equals("X"))
				break;
			string2 = br.readLine();
			count = 0;
			
			for (int curr = 0; curr < string1.length(); curr++) {
				if (string1.charAt(curr) != string2.charAt(curr))
					count++;
			}
			System.out.println("Hamming distance is " + count + ".");
		}
		br.close();
	}

}
