import java.math.BigInteger;
import java.util.Scanner;

public class Level_101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] big = new BigInteger[n+2];
		big[0] = BigInteger.ZERO;
		big[1] = BigInteger.ONE;
		
		for(int i = 2; i <= n; i++) {
			big[i] = big[i-1].add(big[i-2]);
		}
		System.out.println(big[n]);
	}
}
