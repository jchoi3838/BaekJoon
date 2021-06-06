import java.util.Scanner;

public class Level_91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		int mod = 1000000;
		int[] dp = new int[n.length() + 1];
		dp[0] = 1;

		for(int i = 1; i <= n.length(); i++) {
			int num = n.charAt(i-1) - '0';
			if(1 <= num && num <= 9) {
				dp[i] += dp[i-1];
				dp[i] %= mod;
			}
			if(i == 1)
				continue;
			if((n.charAt(i-2) - '0') == 0)
				continue;
			int prev = (n.charAt(i-2) - '0') * 10;
			int cur = n.charAt(i-1) - '0';
			
			if(prev + cur <= 26) {
				dp[i] += dp[i-2];
				dp[i] %= mod;
			}
		}
		System.out.println(dp[n.length()]);
	}
}
