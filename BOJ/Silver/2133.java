package p2133_타일_채우기_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+1];
		
		dp[0] = 1;
		long tmp=0;
		for(int i=1; i<=N; i++) {
			if(i==2) {
				dp[i] = 3;
				continue;
			}
			
			if(i % 2 == 0) {
				
				dp[i] += dp[i-2] * dp[2];
				
				if(i>=6) {
					tmp += dp[i-4] * 2;
					dp[i] += tmp;
				}
				
				dp[i] += 2;
			} else dp[i] = 0;
		}
		
		System.out.println(dp[N]);
		
	}
}
