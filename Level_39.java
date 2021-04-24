import java.util.Scanner;

public class Level_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (B >= C) {
			System.out.println(-1);
		} else {
			System.out.println(A / (C - B) + 1);
		}
	}
}
