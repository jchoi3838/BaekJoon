import java.util.Scanner;

public class Level_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if ((num / 10) == 0)
			num *= 10;
		int newNum = num;

		while (true) {
			int firDig = newNum % 10;
			int secDig = newNum / 10;
			//System.out.println(secDig + " + " + firDig);
			int sum = (firDig) + (secDig);
			if (sum >= 10)
				sum %= 10;
		//	System.out.println("sum: " + sum);
			newNum = (firDig * 10) + sum;
		//	System.out.println("newNum: " + newNum);
			count++;
		//	System.out.println("count: " + count);
			if (num == newNum)
				break;
		}
		System.out.println(count);
	}
}
