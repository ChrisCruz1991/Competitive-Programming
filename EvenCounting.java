import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EvenCounting {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int n, multiple, sum;
		
		for(int i=0;i<test;i++){
			n = Integer.parseInt(br.readLine());
			sum = 0;
			
			for(multiple = 1; multiple<=n;multiple++){
				if(n%multiple==0)
					sum += multiple;
			}
		}
	}

}
