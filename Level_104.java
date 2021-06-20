import java.util.Scanner;

public class Level_104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		double max = arr[0];
		
		for(int i = 1; i < n; i++) {
			arr[i] = Math.max(arr[i], arr[i-1] * arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.printf("%.3f", max);
	}
}
