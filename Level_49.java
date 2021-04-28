import java.util.Scanner;

public class Level_49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0; //총 이용 날짜 
		while(true) {
			int L = sc.nextInt(); //사용가능 날짜 
			int P = sc.nextInt(); //연속 일자 
			int V = sc.nextInt(); //휴가 
			if(L == 0 && P == 0 && V == 0)
				break;
			sum = (V/P) * L + Math.min(V%P,  L);
			System.out.println("Case " + (++i) + ": " + sum);
		}
	}
}
