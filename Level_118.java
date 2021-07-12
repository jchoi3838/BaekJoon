
public class Level_118 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = f(i);
			
			if(n < 10001)
				check[n] = true;
		}
		
		for(int i = 1; i< 10001; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}
	public static int f(int num) {
		int sum = num;
		
		while(num != 0) {
			sum += num % 10;
			num = num/10;
		}
		return sum;
	}
	
}
