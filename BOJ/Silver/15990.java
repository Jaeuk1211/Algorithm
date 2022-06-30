package p15990_123더하기5_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		BigInteger[][] dp = new BigInteger[100001][3];
		int temp=4;

		dp[1][0]=BigInteger.ONE;
		dp[1][1]=BigInteger.ZERO;
		dp[1][2]=BigInteger.ZERO;
		
		dp[2][0]=BigInteger.ZERO;
		dp[2][1]=BigInteger.ONE;
		dp[2][2]=BigInteger.ZERO;
			
		dp[3][0]=BigInteger.ONE;
		dp[3][1]=BigInteger.ONE;
		dp[3][2]=BigInteger.ONE;
		
		for(int i=1; i<=tc; i++) {

			int N = Integer.parseInt(br.readLine());
				
			for(int j=temp; j<=N; j++) {
				dp[j][0] = dp[j-1][1].add(dp[j-1][2]).mod(BigInteger.valueOf(1000000009));
				dp[j][1] = dp[j-2][0].add(dp[j-2][2]).mod(BigInteger.valueOf(1000000009));
				dp[j][2] = dp[j-3][0].add(dp[j-3][1]).mod(BigInteger.valueOf(1000000009));
				
				temp++;
			}
				
			System.out.println(dp[N][0].add(dp[N][1]).add(dp[N][2]).mod(BigInteger.valueOf(1000000009)));
		}
	}
}
