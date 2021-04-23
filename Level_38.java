import java.util.Scanner;

public class Level_38 {
	static int N;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		System.out.println(recursion(N));
	}

	public static int recursion(int N) {
		dp = new int[N + 1];

		dp[1] = 0;

		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 3 == 0)
				dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
			if (i % 2 == 0)
				dp[i] = Math.min(dp[i / 2] + 1, dp[i]);

		}
		return dp[N];
	}
}
