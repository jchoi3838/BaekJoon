import java.util.Scanner;

//11047번
public class Level_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		int index = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] <= K)
				index = i;
		}
		int count = 0;
		for (int i = index; i >= 0; i--) {
			if (arr[i] <= K) {
				count += K / arr[i];
				K %= arr[i];

				if (K == 0)
					break;
			} else {

			}
		}
		System.out.println(count);
	}
}
