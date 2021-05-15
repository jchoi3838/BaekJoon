import java.util.Scanner;

public class Level_69 {
	static Long[][] dp;
	static int n;
	final static long MOD = 1000000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		dp = new Long[n+1][10];
		
		for(int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}
		long result = 0;
		
		for(int i = 1; i <= 9; i++) {
			result += recur(n, i);
		}
		System.out.println(result % MOD);
	}
	static long recur(int n, int val) {
		if(n == 1) {
			return dp[n][val];
		}
		if(dp[n][val]== null) {
			if(val == 0)
				dp[n][val] = recur(n-1, 1);
			else if(val == 9)
				dp[n][val] = recur(n-1, 8);
			else
				dp[n][val] = recur(n-1, val-1) + recur(n-1, val+1);
		}
		return dp[n][val] % MOD;
	}
}
