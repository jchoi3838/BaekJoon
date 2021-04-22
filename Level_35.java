import java.util.Arrays;
import java.util.Scanner;

public class Level_35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		double[] arr;
		double sum = 0;
		double avg = 0;
		double count = 0;
		for (int j = 0; j < C; j++) {
			int N = sc.nextInt();
			arr = new double[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			avg = sum / N;
			for (int i = 0; i < N; i++) {
				if (arr[i] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f",(count * 100.0 / N));
			System.out.println("%");
			avg = sum = count = 0;
		}
	}
}
