import java.util.Scanner;

public class Level_56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		if (N == 1)
			System.out.println(0);
		else {
			int count = 0;
			for (int i = N - 2; i >= 0; i--) {
				int max = arr[i + 1];
				int min = arr[i];

				if (min >= max) {
					count += min - (max - 1);
					arr[i] = max - 1;
				}
			}
			System.out.println(count);

		}
	}
}
