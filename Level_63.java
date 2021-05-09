import java.util.Scanner;

public class Level_63 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] dp = new int[n+1];

		for (int i = 0; i < dp.length; i++) {

			if (i == 0)
				dp[0] = 0;
			else if (i == 1)
				dp[1] = 1;

			else
				dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[n]);

	}
}
