import java.util.Scanner;

public class Level_85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] dp = new int[k + 1];
		
		dp[0] = 0;
		
		for (int i = 1; i <= k; i++) {
			dp[i] = 100001;
		}
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
}
		for(int i = 1; i <=n; i++) {
			for(int j= arr[i]; j <=k; j++) {
				dp[j] = Math.min(dp[j],  dp[j-arr[i]]+1);
			}
		}
		if(dp[k] == 100001) dp[k] = -1;
		System.out.println(dp[k]);
				
	}
}
