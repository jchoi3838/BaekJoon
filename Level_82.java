import java.util.Scanner;

public class Level_82 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] Tri = new int[n+1][n+1];
		
		for(int i= 0; i < Tri.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(i == j|| j== 0)
					Tri[i][j] = 1;
				else
					Tri[i][j] = (Tri[i-1][j-1] + Tri[i-1][j]) % 10007;
			}
		}
		System.out.println(Tri[n][k]);
	}
}
