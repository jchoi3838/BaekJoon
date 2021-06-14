import java.util.Scanner;

public class Level_98 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word1 = sc.next();
		String word2 = sc.next();

		int max = 0;
		int[][] map = new int[word1.length() + 1][word2.length() + 1];

		for (int i = 1; i <= word1.length(); i++) {
			for (int j = 1; j <= word2.length(); j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					map[i][j] = map[i - 1][j - 1] + 1;
					max = Math.max(max, map[i][j]);
				}
			}
		}
		System.out.println(max);
	}
}
