import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Level_54 {
	public static class Jewelry{
		int m;
		int v;
		public Jewelry(int m, int v) {
			this.m = m;
			this.v = v;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		ArrayList<Jewelry> jewelry = new ArrayList<>();
		ArrayList<Integer> bag = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			jewelry.add(new Jewelry(sc.nextInt(), sc.nextInt()));
		}
		for(int i = 0; i < k; i++) {
			bag.add(sc.nextInt());
		}
		
		Collections.sort(jewelry, new Comparator<Jewelry>() {

			@Override
			public int compare(Jewelry o1, Jewelry o2) {
				// TODO Auto-generated method stub
				if(o1.m <= o2.m) return -1;
				else return 1;
			}
			
		});
		Collections.sort(bag);
		
		long ans = 0;
		int index = 0;
		
		for(int i : bag) {
			while(index < n) {
				if(i >= jewelry.get(index).m) {
					pq.add(-(jewelry.get(index++).v));
				}else
					break;
			}
			if(!pq.isEmpty()) ans += Math.abs(pq.poll());
		}
		System.out.println(ans);
	}
}
