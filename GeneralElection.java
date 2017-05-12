import java.util.Scanner;


public class GeneralElection {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		
		while (cases --> 0) {
			int rows = kb.nextInt(), cols = kb.nextInt();
			int[][] arr = new int[cols][rows];
			int[] results = new int[rows];
			
			for (int i=0;i<arr.length;i++)
				for (int j=0;j<arr[i].length;j++)
					arr[i][j] = kb.nextInt();
			
			for (int k=0;k<arr[0].length;k++) {
				int count = 0;
				for (int o=0;o<arr.length;o++)
					count += arr[o][k];
				results[k] = count;
			}
			int max = results[0];
			int index = 0;
			for (int d=1;d<results.length;d++) {
				if (max < results[d]) {
					max = results[d];
					index = d;
				}
			}
			System.out.println(index + 1);
		}

		kb.close();
	}

}
