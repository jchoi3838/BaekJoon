import java.util.Scanner;

public class Level_74 {
	static int[][] dp = new int[30][30];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			int n = sc.nextInt();

			sb.append(comb(n, r)).append('\n');
		}
		System.out.println(sb);
	}

	public static int comb(int n, int r) {
		if (dp[n][r] > 0)
			return dp[n][r];

		if (n == r || r == 0)
			return dp[n][r] = 1;

		return dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
	}
}
