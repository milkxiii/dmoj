import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WC17RingsOfPower {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] splitRings = input.split(" ");
		
		int count = 1;
		for(String s : splitRings) {
			count += Integer.parseInt(s);
		}
		System.out.println(count);
	}

}
