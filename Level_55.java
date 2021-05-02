import java.util.Arrays;
import java.util.Scanner;

public class Level_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		double[] arr = new double[N];
		int count = 1;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		double range = (arr[0] - 0.5 + L);
		for (int i = 1; i < arr.length; i++) {
			if (range < arr[i] + 0.5) {
				range = arr[i] - 0.5 + L;
				count++;
			}
		}
		System.out.println(count);
	}

}
