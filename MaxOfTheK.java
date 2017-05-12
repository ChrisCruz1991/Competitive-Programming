import java.util.Scanner;
public class MaxOfTheK {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = Integer.parseInt(kb.next());
		
		while (test-- > 0) {
			StringBuilder str = new StringBuilder();
			int n = Integer.parseInt(kb.next());
			int k = Integer.parseInt(kb.next());
			int formula = (n-k) + 1;
			int maxi;
			int[] arr = new int[n];
			
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(kb.next());
			
			for (int idx = 0; idx < k; idx++) {
				maxi = max(arr, idx, k);
				str.append(maxi);
				if (formula-- > 1)
					str.append(" ");
				if (k != arr.length)
					k++;
				else
					break;
			}
			System.out.println(str.toString());
		}
	}
	
	private static int max(int[] arr, int idx, int k) {
		int max = arr[idx];
		for (int i = idx + 1; i < k; i++)
			if (max < arr[i])
				max = arr[i];
		return max;
	}

}
