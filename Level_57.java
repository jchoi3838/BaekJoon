import java.util.Scanner;

public class Level_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int[] dp = new int[num+2];
			
			dp[0] = 1;
			dp[1] =1;
			dp[2] = 2;
			for(int j = 3; j <= num; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			System.out.println(dp[num]);

		}
	}

}
