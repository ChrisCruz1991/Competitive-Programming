import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Easy_Sorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t,n;
		String s;
		char[] letter = null;
		t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			n=Integer.parseInt(br.readLine());
			for(int j=0;j<n;j++){
				s=br.readLine();
				letter=s.toCharArray();
				Arrays.sort(letter);
			}
			System.out.println(letter);
		}
	}

}
