import java.util.Scanner;

public class Speed{
	public static void main(String[]args){

		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int n, num = 0, even, odd;

		for(int i = 0; i < t; i++){
			n = kb.nextInt();
			even = 0; 
			odd = 0;
			for ( int j = 0; j < n; j++){
				num = kb.nextInt();

				if (num % 2 == 0){
					even++;
				}
				else if (num % 2 != 0){
					odd++;
				}
			}
			System.out.println(even + " even and " + odd + " odd.");
		}
		kb.close();
	}
}