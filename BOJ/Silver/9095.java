package p9095_123더하기_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=tc; i++) {

			int N = Integer.parseInt(br.readLine());
			int[] dp = new int[11];
			
			dp[1]=1;
			dp[2]=2;
			dp[3]=4;
			
			for(int j=4; j<=N; j++) {
				dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
			}
			
			System.out.println(dp[N]);
		}
	}
}