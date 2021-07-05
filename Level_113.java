import java.util.Scanner;

public class Level_113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(combi(n - 1, k - 1));
	}

	public static int combi(int n, int k) {
		if (n == k || k == 0)
			return 1;
		return combi(n - 1, k - 1) + combi(n - 1, k);
	}
}
