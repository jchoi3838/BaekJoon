import java.util.Arrays;
import java.util.Scanner;

public class Level_46 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int temp = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i] * (arr.length - i));
		}
		
		System.out.println(max);
	}

}
