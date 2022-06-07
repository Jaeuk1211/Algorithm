package p9507_Generations_of_Tribbles_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			
			int N = Integer.parseInt(br.readLine());
			long[] dp = new long[N+1];
			
			if(N<4) {
				
				if(N==0) System.out.println(1);
				else if(N==1) System.out.println(1);
				else if(N==2) System.out.println(2);
				else System.out.println(4);
				
			} else {
				dp[0] = 1;
				dp[1] = 1;
				dp[2] = 2;
				dp[3] = 4;
			
				for(int j=4; j<=N; j++) {
					dp[j] = dp[j-4] + dp[j-3] + dp[j-2] + dp[j-1];
				}
			
				System.out.println(dp[N]);
			}
			
		}
		
	}
}
