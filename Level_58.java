import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Level_58 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] temp = new int[n];
		
		for (int i = 0; i < n; i++) {
			temp[i] = Integer.parseInt(br.readLine());
		}

		int[] zero = new int[41];
		int[] one = new int[41];

		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;

		for (int j = 2; j < 41; j++) {
			zero[j] = zero[j - 1] + zero[j - 2];
			one[j] = one[j - 1] + one[j - 2];

		}

		for (int i = 0; i < n; i++) {
			System.out.println(zero[temp[i]] + " " + one[temp[i]]);

		}
	}

}