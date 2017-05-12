import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BinaryCheckSum {

	public static void main(String[]args)throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test, count = 0;
		long decimalNumber;
		String binaryNum;
		char[] bits;
		
		test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++){
			decimalNumber = Integer.parseInt(br.readLine());
			binaryNum = Integer.toString((int) decimalNumber, 2);
			bits = binaryNum.toCharArray();
			
			for(int j = 0; j < bits.length;j++){
				if(bits[j] == '1')
					count++;
			}
		}
		System.out.println(count);
		
	}

}
