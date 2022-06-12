package p9657_돌_게임3_Silver3;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] dp = new String[N+1];
		
		if(N<=4) {
			
			if(N==2) System.out.println("CY");
			else System.out.println("SK");
			
		} else {
			
			dp[1] = "SK";	
			dp[2] = "CY";
			dp[3] = "SK";
			dp[4] = "SK";
			
			for(int i=5; i<=N; i++) {
				if(dp[i-1].equals("SK") && dp[i-3].equals("SK") && dp[i-4].equals("SK"))
					dp[i] = "CY";
				else
					dp[i] = "SK";		
			}
		
			System.out.println(dp[N]);
		}
	}
}