import java.util.Scanner;

public class Level_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] arr2 = new int[M];
		int[] count = new int[arr2.length];
		for (int i = 0; i < M; i++) {
			arr2[i] = sc.nextInt();

			for (int j = 0; j < N; j++) {
				if (arr2[i] == arr[j]) {
					count[i] = 1;
					break;
				} else {
					count[i] = 0;

				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
