package p13301_타일_장식물_Bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[81];
		
		dp[0]=1;
		dp[1]=1;
		for(int i=2; i<=N; i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		if(N==1) System.out.println(4);
		else System.out.println(dp[N-1]*2 + (dp[N-1]+dp[N-2])*2);
			
	}
}
