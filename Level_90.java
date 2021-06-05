import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] size = new int[n+2];
        int[] dp = new int[n+2];
        
        int max = 0;
        
        for(int i = 1; i <= n; i++){
            size[i] = sc.nextInt();
            dp[i] = 1;
        }
        
        dp[1] = 1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(size[j] < size[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
            System.out.println(max);
    }
}
