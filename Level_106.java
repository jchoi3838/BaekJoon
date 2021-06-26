import java.util.Scanner;

public class Level_106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] dp = new long[65][10];

		for(int k = 0; k < n; k++) {
			int t = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			dp[1][i] = i + 1;
		}
		for (int i = 2; i <= t; i++) {
			dp[i][0] = 1;
			for (int j = 1; j < 10; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		System.out.println(dp[t][9]);
		}
	}
}
