import java.util.Scanner;

public class Level_95 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = -1;
		}
		dp[0] = 0;
		for (int i = 0; i < n - 1; i++) {
			if (dp[i] == -1)
				continue;
			for (int j = 1; j <= arr[i]; j++) {
				if (i + j < n) {
					if (dp[i + j] == -1 || dp[i + j] > dp[i] + 1)
						dp[i + j] = dp[i] + 1;
				}
			}
		}
		System.out.println(dp[n - 1]);
	}
}
