import java.util.Scanner;

public class Level_107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];

		int max = 0;

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			dp[i] = arr[i];
			for (int j = 1; j < i; j++) {
				if (arr[j] < arr[i] && dp[i] < dp[j] + arr[i])
					dp[i] = dp[j] + arr[i];
			}
			if (max < dp[i])
				max = dp[i];
		}
		System.out.println(max);
	}
}
