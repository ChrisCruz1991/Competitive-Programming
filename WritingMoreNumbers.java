import java.util.HashMap;
import java.util.Scanner;
public class WritingMoreNumbers {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		
		while (test --> 0) {
			int number = kb.nextInt();
			String word = int_to_Words(number);
			System.out.println(word);
		}
		kb.close();
	}
	
	private static String int_to_Words(int number) {
		HashMap<Integer,String>map = new HashMap<>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		return map.get(number);
	}

}
