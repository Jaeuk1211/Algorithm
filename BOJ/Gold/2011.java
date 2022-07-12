package p2011_암호코드_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split("");
		int[] data = new int[5001];
		long[] dp = new long[5001];
		
		for(int i=0; i<input.length; i++) {
			data[i] = Integer.parseInt(input[i]);
		}
		
		if(data[0] == 0) {
			System.out.println(0);
			return;
		}
		
		dp[0] = 1;
		dp[1] = 1;
		for(int i=1; i<input.length; i++) {
			if(1<=data[i] && data[i]<=9) {
				dp[i+1] += dp[i];
				dp[i+1] %= 1000000;
			}
			if((data[i-1] == 1) || (data[i-1] == 2 && data[i] <= 6)) {
				dp[i+1] += dp[i-1];
				dp[i+1] %= 1000000;
			}
			
			dp[i+1] %= 1000000;
			
		}
		
		System.out.println(dp[input.length] % 1000000);
		
	}
}
