import java.util.Scanner;

public class Level_66 {
	static int[] arr;
	static Integer[] dp;
	static int max;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp = new Integer[n];
		
		dp[0] = arr[0];
		max = dp[0];
		
		recur(n-1);
		System.out.println(max);
	}
	public static int recur(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);
			
			max = Math.max(dp[n], max);
		}
		return dp[n];
	}
}
