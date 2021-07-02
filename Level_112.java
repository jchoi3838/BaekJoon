import java.util.Scanner;

public class Level_112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long buf = 0;
		long[] dp = new long[101];

		for (int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			for (int j = 1; j <= i - 3; j++) {
				dp[i] = Math.max(dp[i], (j + 1) * dp[i - (j + 2)]);
			}
		}
		System.out.println(dp[n]);
	}
}
