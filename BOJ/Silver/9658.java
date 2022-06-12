package p9658_돌_게임4_Silver1;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] dp = new String[1001];
		
			
		dp[1] = "CY";	
		dp[2] = "SK";
		dp[3] = "CY";
		dp[4] = "SK";
		dp[5] = "SK";
		dp[6] = "SK";
		dp[7] = "SK";
			
		for(int i=8; i<=N; i++) {
			if(i % 7 == 1 || i % 7 == 3)
				dp[i] = "CY";
			else
				dp[i] = "SK";		
		}
		
		System.out.println(dp[N]);
		
	}
}
