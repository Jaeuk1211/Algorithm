package p2579_계단_오르기_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] val = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			val[i] = Integer.parseInt(br.readLine());
		}
	
		if(N<4) {
			
			if(N==1) System.out.println(val[1]);
			else if(N==2) System.out.println(val[1]+val[2]);
			else System.out.println(Math.max(val[1]+val[3],val[2]+val[3]));
			
		} else {
			
			dp[1] = val[1];
			dp[2] = val[1]+val[2];
			dp[3] = Math.max(val[1]+val[3],val[2]+val[3]);
			
			for(int i=4; i<=N; i++) {
				dp[i] = Math.max(dp[i-2]+val[i], dp[i-3]+val[i-1]+val[i]);
			}
		
			System.out.println(dp[N]);
		}
		
	}
}
