import java.util.Scanner;

public class Level_84 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] map = new int[n+1][m+1];
		int MAX = -1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= m; j++) {
				map[i][j] = sc.nextInt();
				
				MAX = Math.max(map[i][j-1], Math.max(map[i-1][j-1], map[i-1][j]));
				map[i][j] += MAX;
			}
		}
		System.out.println(map[n][m]);
	}
}
