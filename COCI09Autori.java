import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COCI09Autori {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] splitNames = input.split("-");
		
		for(String s : splitNames) {
			System.out.print(s.charAt(0));
		}
	}

}
