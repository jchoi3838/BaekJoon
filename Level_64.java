import java.util.Scanner;

public class Level_64 {
	public static int[] dp;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n];
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && dp[i] < dp[j] + 1)
					dp[i] = dp[j] + 1;
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (dp[i] > max)
				max = dp[i];
		}
		System.out.println(max);
	}
}
