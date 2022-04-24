import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class coci07_3_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(line);
		int diff1 = line[1] - line[0];
		int diff2 = line [2] - line[1];
		
		if (diff1 == diff2) {
			System.out.println(line[2] + diff1);
		}
		else if (diff1 > diff2) {
			System.out.println(line[0] + diff2);
		}
		else {
			System.out.println(line[1] + diff1);
		}		
		
	}

}
