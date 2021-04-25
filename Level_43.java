import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//1931번
public class Level_43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>(){
			public int compare(int[] a, int[] b) {
				if(a[1] == b[1]) {
				//	return a[0] - b[0];}
				//	return a[0] < b[0] ? a[0] : b[0];}
					return Integer.compare(a[0], b[0]);}
					else {
				//		return a[1] - b[1];}
				//		return a[1] < b[1] ? a[1] :b[1];}
						return Integer.compare(a[1], b[1]);}

			}
		});
		int count = 0;
		int prev_endTime = 0;
		for(int i = 0; i < N; i++) {
			if(prev_endTime <= arr[i][0]) {
				prev_endTime = arr[i][1];
			count++;
			}
		}
		System.out.println(count);
	}
}
