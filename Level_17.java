import java.util.Scanner;

public class Level_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp = num2;
		int sum = 0;
		int count = 0;
		
		while (temp != 0) {
			temp /= 10;
			count++;
		}
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = num2 % 10;
			num2 /= 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum += num1 * arr[i] * Math.pow(10, i);
			System.out.println(num1 * arr[i]);
		}
		System.out.println(sum);
	}

}
