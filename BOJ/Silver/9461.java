package p9461_파도반_수열_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			
			int N = Integer.parseInt(br.readLine());
			long[] dp = new long[N+1];
			
			
			if(N <= 2) {
				if(N==1) System.out.println(1);
				else System.out.println(1);
				
			} else {			
				dp[0] = 0;
				dp[1] = 1;
				dp[2] = 1;
			
				for(int j=3; j<=N; j++) {
					dp[j] = dp[j-3] + dp[j-2];
				}
			
				System.out.println(dp[N]);
			}
		}
		
	}
}
