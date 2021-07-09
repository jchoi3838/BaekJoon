import java.util.Scanner;

public class Level_117 {
	static int N = 0, ans = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		calc(0, 0);
		System.out.println(ans);
	}

	public static void calc(int n, int sum) {
		for (int i = 0; i < 3; i++) {
			if (n == 0 && i == 0)
				continue;
			if (n == N) {
				if (sum % 3 == 0)
					ans++;
				return;
			} else {
				calc(n + 1, sum + i);
			}

		}

	}
}
