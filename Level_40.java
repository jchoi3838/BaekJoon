import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Level_40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
