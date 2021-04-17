import java.util.Scanner;

public class Level_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}

}
