import java.util.Scanner;

public class Level_72 {
	static int n;
	static int[][] arr;
	static int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		result = 0;
		recur(0, 0);
		System.out.println(result);

	}

	public static void recur(int idx, int pay) {
		if (idx >= n) {
			result = Math.max(result, pay);
			return;
		}
		if (idx + arr[idx][0] <= n)
			recur(idx + arr[idx][0], pay + arr[idx][1]);
		else
			recur(idx + arr[idx][0], pay);
		recur(idx + 1, pay);
	}
}
