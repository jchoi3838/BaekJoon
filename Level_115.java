import java.util.Scanner;

public class Level_115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int count = 0;

		for (int i = 0; i < h; i++) {
			String input = sc.next();
			count = 0;

			for (int j = 0; j < w; j++) {
				if (input.charAt(j) == '.' && count == 0)
					System.out.print("-1 ");
				else if (input.charAt(j) == 'c') {
					System.out.print("0 ");
					count = 1;
				} else if (input.charAt(j) == '.' && count != 0) {
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println();
		}
	}
}
