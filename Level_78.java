import java.util.Scanner;

public class Level_78 {
	public static int[] dp = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(recur(n));
	}
	public static int recur(int n) {
		if(dp[n] == -1)
			dp[n] = (recur(n-1) + recur(n-2)) % 15746;
		return dp[n];
	}
}
