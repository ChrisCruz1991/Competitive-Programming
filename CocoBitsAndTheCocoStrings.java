import java.util.Scanner;
public class CocoBitsAndTheCocoStrings {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		
		while (test-- > 0){
			String str = kb.nextLine();
			
			if (str.toUpperCase().equals(true))
				System.out.println(str.toLowerCase());
			else
				System.out.println(str.toUpperCase());
		}
	}

}
