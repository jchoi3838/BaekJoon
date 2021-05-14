import java.util.Scanner;

public class Level_68 {
	public static long[] checked;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		checked = new long[n + 1];

		System.out.println(dp(n));
	}

	public static long dp(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else if (checked[n] != 0)
			return checked[n];
		else
			return checked[n] = dp(n - 1) + dp(n - 2);
	}
}
