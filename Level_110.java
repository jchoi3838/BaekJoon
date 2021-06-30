import java.util.Scanner;

public class Level_110 {
	static int[] arr;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			arr = new int[n];
			dp = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			solve();
		}
	}

	public static void solve() {
		int max = arr[0];
		dp[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (dp[i - 1] < 0)
				dp[i - 1] = 0;
			dp[i] = dp[i - 1] + arr[i];
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}

