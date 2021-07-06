import java.util.Scanner;

public class Level_114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] dp = new long[36];
		dp[0] = 1;
		for (int i = 1; i <= 35; i++) {
			int temp = i;
			while (temp != 0) {
				dp[i] += dp[i - temp] * dp[temp - 1];
				temp--;
			}
		}
		int n = sc.nextInt();
		System.out.println(dp[n]);
	}
}
