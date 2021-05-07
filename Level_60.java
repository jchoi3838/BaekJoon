import java.util.Scanner;

public class Level_60 {
	final static int RED = 0;
	final static int GREEN = 1;
	final static int BLUE = 2;

	static int[][] cost;
	static int[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		cost = new int[n][3];
		dp = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			cost[i][RED]  = sc.nextInt();
			cost[i][GREEN] = sc.nextInt();
			cost[i][BLUE] = sc.nextInt();
		}
		dp[0][RED] = cost[0][RED];
		dp[0][GREEN] = cost[0][GREEN];
		dp[0][BLUE] = cost[0][BLUE];
		
		System.out.println(Math.min(PaintCost(n-1, RED), Math.min(PaintCost(n-1, GREEN), PaintCost(n-1, BLUE))));
	}
	public static int PaintCost(int n, int color) {
		if(dp[n][color] == 0) {
			if(color == RED)
				dp[n][RED] = Math.min(PaintCost(n-1, GREEN), PaintCost(n-1, BLUE)) + cost[n][RED];
			else if(color == GREEN)
				dp[n][GREEN] = Math.min(PaintCost(n-1, RED), PaintCost(n-1, BLUE)) + cost[n][GREEN];
			else
				dp[n][BLUE] = Math.min(PaintCost(n-1, GREEN), PaintCost(n-1, RED)) + cost[n][BLUE];

		}
		return dp[n][color];
		
	}
}
