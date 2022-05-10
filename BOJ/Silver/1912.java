package p1912_연속합_Silver2;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	
	static long[] num;
	static long[] dp;
	
	public static void main(String[] args) throws Exception{	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		num = new long[N];
		dp = new long[N];
		
		String[] s = br.readLine().split(" ");
		for(int j=0; j<s.length; j++) {
			num[j] = Long.parseLong(s[j]);
			dp[j] = num[j];
		}
		
		for(int i=1; i<N; i++) {
			if(dp[i] < dp[i-1] + num[i]) {
				dp[i] = dp[i-1] + num[i];
			}
		}
		
		long res = -1000;
		for(int i=0; i<N; i++) {
			if(dp[i] > res) res = dp[i];
		}
		
		System.out.println(res);
		
	}
}
