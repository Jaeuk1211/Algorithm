package p1463_1로_만들기_Silver3;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		
		dp[0] = Integer.MAX_VALUE;
		dp[1] = 0;
		for(int i=2; i<=N; i++) {
			int m1 = 0;
			int m2 = 0;
			int m3 = 0;
			
			if(i%3 == 0) m1 = i/3;
			
			if(i%2 == 0) m2 = i/2;
			
			m3 = i-1;
			
			dp[i] += Math.min(Math.min(dp[m1], dp[m2]), dp[m3])+1;
			
		}		
		
		System.out.println(dp[N]);
		
	}
}
