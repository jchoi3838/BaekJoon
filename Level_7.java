import java.util.Scanner;

public class Level_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m >= 45)
			System.out.println(h +" " + (m-45));
		else {
			m += 15;
			if(h == 0)
				h += 23;
			else
				h -= 1;
			System.out.println(h + " " + m);
		}
	}
}
