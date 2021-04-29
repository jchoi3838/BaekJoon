import java.util.PriorityQueue;
import java.util.Scanner;

public class Level_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		for(int i = 0; i < N; i++) {
			pq.add(sc.nextLong());
		}
		long sum = 0;
		while(pq.size() > 1) {
			long temp1 = pq.poll();
			long temp2 = pq.poll();
			
			sum += temp1 + temp2;
			pq.add(temp1 + temp2);
		}
		System.out.println(sum);
	}

}
