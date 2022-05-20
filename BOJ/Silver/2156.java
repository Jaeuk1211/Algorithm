package p2156_포도주_시식_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] data = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 0;
		dp[1] = data[1];
		
		for(int i=2; i<=N; i++) {
			
			if(i==2) dp[i] = data[1] + data[2];
			else if(i==3) dp[i] = Math.max(Math.max(data[1] + data[2], data[2] + data[3]),data[1] + data[3]);
			else dp[i] = Math.max(Math.max(dp[i-2] + data[i], dp[i-3] + data[i-1] + data[i]),dp[i-1]);
			
		}
		
		System.out.println(dp[N]);
		
	}
}
