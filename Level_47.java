import java.util.Scanner;
//10162
public class Level_47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = { 300, 60, 10 };
		int[] count = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (T > 0) {
				count[i] = T / arr[i];
				T %= arr[i];
			}

		}
		
		if (T != 0) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < count.length; i++) {
				System.out.println(count[i]);
			}
		}
	}

}
