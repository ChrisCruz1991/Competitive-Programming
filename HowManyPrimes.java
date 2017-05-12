import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class HowManyPrimes {
	
	public static void main(String[]args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		long a, b;
		boolean isPrime = true;
		int count = 0;
		
		while(true){
			a = Long.parseLong(token.nextToken());
			b = Long.parseLong(token.nextToken());
			
			if(a==0 && b==0)
				break;
			
			for(int i=(int) a;i<b;i++){
				if(i%b==0){
					isPrime = false;
				}
				else{
					isPrime = true;
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
