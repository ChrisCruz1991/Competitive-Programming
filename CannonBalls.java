import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CannonBalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int levelFloors;

		while(true) 
		{
			levelFloors = Integer.parseInt(br.readLine());
			int sumFloors = 0;
			if(levelFloors == 0)
				break;

			for(int i = levelFloors; i >= 1; i--)
			{
				sumFloors += (int)Math.pow(i, 2);
			}
			System.out.println(sumFloors);
		}
	}

}
