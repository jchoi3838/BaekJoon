import java.util.Scanner;

public class Level_102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[][] dp = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		dp[0][0] = arr[0];
		dp[0][1] = arr[0];

		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.max(dp[i - 1][0] + arr[i], arr[i]);
			dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1] + arr[i]);
			max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
		}

		System.out.println(max);
	}
}
