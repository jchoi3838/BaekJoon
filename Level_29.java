import java.util.Scanner;

public class Level_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) max = arr[i];
		}
		for(int i = 0; i < N; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
		}
		System.out.println(sum / N);
	}

}
