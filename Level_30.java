import java.util.Scanner;

public class Level_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (a+b));
		}
	}

}
