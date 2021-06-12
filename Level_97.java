import java.util.Scanner;

public class Level_97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dp = new int[n+1];
		
		fib(dp, n);
		
		int cur = 0;
		int ans = 1;
		
		for(int i = 0; i < m; i++) {
			int t = sc.nextInt();
			ans *= dp[t - cur - 1];
			cur = t;
		}
		
		ans *= dp[n-cur];
		System.out.println(ans);
		
	}
	private static void fib(int[] dp, int n) {
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
	}
}
