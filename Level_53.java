import java.util.Scanner;

public class Level_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char fir = s.charAt(0);
		char num0 = 0;
		char num1 = 0;
		
		if(fir == '0')
			num0++;
		else
			num1++;
		
		for(int i = 1; i < s.length(); i++) {
			char comp = s.charAt(i);
			if(comp == fir)
				continue;	
			else if(comp == '0')
				num0++;
			else
				num1++;
			fir = comp;
		}
		System.out.println(Math.min(num0, num1));
	}

}
