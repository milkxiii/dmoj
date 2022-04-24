import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class coci18_1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		Random ran = new Random();
		
		for (int i = 0; i < N - 1; i++) {
			int x = ran.nextInt(K)+1;
			K -= x;
			System.out.println(x);
		}
		System.out.println(K);
	}

}
