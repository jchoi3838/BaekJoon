import java.util.Scanner;

public class Level_71 {
	public static Long[] sequence = new Long[101];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sequence[0] = 0L;
		sequence[1] = 1L;
		sequence[2] = 1L;
		sequence[3] = 1L;

		while (n-- > 0) {
			int i = sc.nextInt();
			System.out.println(recur(i));
		}
	}

	public static Long recur(int n) {
		if (sequence[n] == null)
			sequence[n] = recur(n - 2) + recur(n - 3);
		return sequence[n];
	}
}
