import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ExamGrader {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine()), tests;
		String letters;
		char[] clave = new char[size];
		char[] responses = new char[size];
		double scores;
		letters = br.readLine();
		clave = letters.toCharArray();
		tests = Integer.parseInt(br.readLine());
		DecimalFormat format = new DecimalFormat("0.00");

		for(int i=0;i<tests;i++){
			letters = br.readLine();
			responses = letters.toCharArray();
			scores = 0.0;

			for(int j=0;j<responses.length;j++){
				if(responses[j] != '#'){
					if(responses[j] == clave[j])
						scores++;
					else if(responses[j] != clave[j])
						scores -= 0.25;
				}
			}
			System.out.println(format.format(scores));
		}
	}

}
