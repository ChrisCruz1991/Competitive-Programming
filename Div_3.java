import java.util.Scanner;

public class Div_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] sequence = {1,2,3,4,5,6,7,8,9,10};
		int num = kb.nextInt();
		int count = 0;
		
		for(int i = 0; i < sequence.length; i++){
			if(sequence[i] % 3 == 0){
				count++;
			}
			System.out.println(count);
		}
	}

}
