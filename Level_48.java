import java.util.Scanner;
//13305
public class Level_48 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] cost = new long[N];
		long[] distance = new long[N - 1];

		for (int i = 0; i < N - 1; i++) {
			distance[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			cost[i] = sc.nextLong();
		}
		long min = cost[0];
		long sum = 0;

		for (int i = 0; i < distance.length; i++) {
			if (cost[i] < min) {
				min = cost[i];
			}
			sum += min * distance[i];
		}
		System.out.println(sum);
	}

}
