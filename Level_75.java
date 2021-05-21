import java.util.Scanner;

public class Level_75 {
	static int[][] map;
	static int[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();

			map = new int[2][n + 1];
			dp = new int[2][n + 1];

			for (int j = 0; j < 2; j++) {
				for (int k = 1; k <= n; k++) {
					map[j][k] = sc.nextInt();
				}
			}
			dp[0][1] = map[0][1];
			dp[1][1] = map[1][1];

			for (int j = 2; j <= n; j++) {
				dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + map[0][j];
				dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + map[1][j];
			}
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}

	}
}
