import java.util.Arrays;
import java.util.Scanner;

public class Level_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] dp = new int[5001];
		int N;
		N = sc.nextInt();

		Arrays.fill(dp, 9999);

		dp[3] = dp[5] = 1;

		for (int i = 6; i <= N; i++) {
			dp[i] = Math.min(dp[i - 3] + 1, dp[i - 5] + 1);
		}
		if (dp[N] >= 9999)
			System.out.println(-1);
		else
			System.out.println(dp[N]);
	}
}
