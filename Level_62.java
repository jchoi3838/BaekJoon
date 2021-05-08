import java.util.Scanner;

public class Level_62 {
	static int[][] arr;
	static Integer[][] dp;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		arr = new int[n][n];
		dp = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			dp[n - 1][i] = arr[n - 1][i];
		}

		System.out.println(find(0, 0));

	}

	public static int find(int depth, int index) {
		if (depth == n - 1)
			return dp[depth][index];
		if (dp[depth][index] == null)
			dp[depth][index] = Math.max(find(depth + 1, index), find(depth + 1, index + 1)) + arr[depth][index];
		return dp[depth][index];
	}
}
