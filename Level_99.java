import java.util.Scanner;

public class Level_99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		long ans;
		long[][] dp = new long[100001][4];
		dp[1][1] = dp[2][2] = dp[3][3] = 1;

		for (int i = 1; i < dp.length; i++) {
			if (i > 1)
				dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009;
			if (i > 2)
				dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009;
			if (i > 3)
				dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009;

		}
		while(count -- > 0) {
			int num = sc.nextInt();
			ans = (dp[num][1] + dp[num][2] + dp[num][3]) % 1000000009;
			System.out.println(ans);
			
		}
	}
}
