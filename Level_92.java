import java.math.BigInteger;
import java.util.Scanner;

public class Level_92 {
	public static BigInteger dp[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		dp = new BigInteger[1001][1001];

		dpRecur(n, m);
		System.out.println(dp[n][m]);
	}

	public static void dpRecur(int n, int m) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					dp[i][j] = new BigInteger("1");
				else
					dp[i][j] = dp[i - 1][j - 1].add(dp[i - 1][j]);
			}
		}
	}
}
