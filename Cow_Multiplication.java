import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Cow_Multiplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		String a = token.nextToken();
		String b = token.nextToken();
		
		char[] valA = a.toCharArray();
		char[] valB = b.toCharArray();
		
		int totalA = 0;
		int totalB = 0;
		
		for(int i=0;i<valA.length;i++){
			totalA += valA[i] - '0';
		}
		for(int j=0;j<valB.length;j++){
			totalB += valB[j] - '0';
		}
		System.out.println(totalA*totalB);

	}

}
