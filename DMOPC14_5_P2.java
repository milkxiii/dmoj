import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DMOPC14_5_P2 {

	public static void main(String[] args) throws IOException {
		int length = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			String input = br.readLine();
			int num1 = (int) Arrays.stream(input.split(" ")).mapToLong(Long::parseLong).toArray()[0];
			int num2 = (int) Arrays.stream(input.split(" ")).mapToLong(Long::parseLong).toArray()[1];
			if (num2 - num1 > length) {
				length = num2 - num1;
			}
		}
		System.out.println(length);

	}

}
