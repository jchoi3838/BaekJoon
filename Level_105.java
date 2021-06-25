import java.util.Scanner;

public class Level_105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int coin = 0;
		
		if(n % 5 == 0) {
			System.out.println(n/5);
		}else {
			while(true) {
				if(n < 0) {
					System.out.println(-1);
					break;
				}
				if(n == 0) {
					System.out.println(coin);
					break;
				}
				n -= 2;
				coin++;
				
				if(n % 5 == 0) {
					coin += n / 5;
					System.out.println(coin);
					break;
				}
			}
		}
	}
}
