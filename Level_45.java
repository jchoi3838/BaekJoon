import java.util.Scanner;
//1541 최소값 구하
public class Level_45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String[] subArr = N.split("\\-");
		int result = 0;
		for (int i = 0; i < subArr.length; i++) {
			String[] sumArr = subArr[i].split("\\+");

			for (int j = 0; j < sumArr.length; j++) {
				if (i == 0)
					result += Integer.parseInt(sumArr[j]);
				else
					result -= Integer.parseInt(sumArr[j]);
			}

		}
		System.out.println(result);

	}
}
