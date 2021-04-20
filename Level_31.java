import java.util.Scanner;

public class Level_31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int sum = 0;
		int count = 1;
		char[] arr = new char[80];
		for (int i = 0; i < len; i++) {
			String input = sc.next();
			for (int j = 0; j < input.length(); j++) {
				arr[j] = input.charAt(j);
				// System.out.println(input.charAt(j));
				if (arr[j] == 'O') {
					if (j >= 1 && arr[j - 1] == arr[j]) {
						sum += ++count;
					} else {
						count = 1;
						sum += count;
					}
				} else {
					count = 0;
				}
			}
			System.out.println(sum);
			sum = 0;

		}
	}

}
