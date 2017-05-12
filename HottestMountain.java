import java.util.Scanner;

public class HottestMountain {

	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int size = kb.nextInt();
		double[] mountain = new double[size];
		int pos = (int) mountain[0];
		
		for (int idx = 1; idx < mountain.length; idx++) {
			mountain[idx] = kb.nextDouble();
			
			if (mountain[idx] >= pos)
				pos = idx;
		}
		System.out.println(pos + 1);
	}

}
