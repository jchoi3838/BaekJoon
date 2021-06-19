import java.util.Scanner;

public class Level_103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 1;
		int max = 1;
		
		for(int i = 0; i< n-1; i++) {
			if(arr[i] <= arr[i+1])
				count++;
			else
				count = 1;
			max = Math.max(max, count);
		}
		int count2 = 1;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] >= arr[i+1])
				count2++;
			else
				count2 = 1;
			max = Math.max(max, count2);
		}
		System.out.println(max);
	}
}
