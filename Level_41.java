import java.util.Arrays;
import java.util.Scanner;
//1139번
public class Level_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받을 사람 수;
		int N = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			sum +=  temp + arr[i];
			temp += arr[i];

		}
		System.out.println(sum);
	}
}
