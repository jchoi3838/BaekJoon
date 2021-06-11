import java.util.Scanner;

public class Level_96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[45];
		int[] b = new int[45];
		
		a[0] = 0;
		a[1] = 1;
		
		b[0] = 1;
		b[1] = 1;
		
		for(int i = 2; i < 45; i++) {
			a[i] = a[i-2] + a[i-1];
			b[i] = b[i-2] + b[i-1];
		}
		System.out.println(a[n-1] + " " + b[n-1]);
	}
}
