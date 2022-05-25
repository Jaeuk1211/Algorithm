package p2491_수열_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int[][] dp = new int[N][2];
		String[] s = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(s[i]);
			dp[i][0] = 1;
			dp[i][1] = 1;
		}
		
		for(int i=1; i<N; i++) {
			if(num[i-1] <= num[i]) dp[i][0] += dp[i-1][0];
			
			if(num[i-1] >= num[i]) dp[i][1] += dp[i-1][1];
		}
		
		int asc=dp[0][0];
		int desc=dp[0][1];
		for(int i=1; i<N; i++) {
			if(dp[i][0] > asc) asc = dp[i][0];
			
			if(dp[i][1] > desc) desc = dp[i][1];
		}
		
		if(asc > desc) System.out.println(asc);
		else System.out.println(desc);
	}
}
