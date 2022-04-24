import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WC15_2_J1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String sentence = "A long time ago in a galaxy far";
		for(int i = 1; i < count; i++) {
			sentence += ", far";
		}
		sentence += " away...";
		System.out.println(sentence);

	}

}
