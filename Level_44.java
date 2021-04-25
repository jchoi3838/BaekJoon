import java.util.Scanner;
//5585
public class Level_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rem = 1000 - N;
		int arr[] = {500, 100, 50, 10, 5, 1};
		int count = 0;
		for(int i =0; i < arr.length; i++) {
		
			if(rem > 0) {
			count += rem / arr[i];
			rem %= arr[i];
			}
		}
		System.out.println(count);
	}

}
