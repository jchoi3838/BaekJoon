import java.util.Scanner;

public class Level_77 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] coin = new int[101];
		int[] dp = new int[10001];

		for (int i = 1; i <= n; i++) {
			coin[i] = sc.nextInt();
		}

		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = coin[i]; j <= k; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}
		System.out.println(dp[k]);
	}
}
