package p1309_동물원_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		BigInteger[][] dp = new BigInteger[N+1][2];
		
		dp[0][0] = BigInteger.ZERO;
		dp[0][1] = BigInteger.ONE;
		for(int i=1; i<=N; i++) {
			dp[i][0] = dp[i-1][0].add(dp[i-1][1].multiply(BigInteger.valueOf(2))).mod(BigInteger.valueOf(9901));
			dp[i][1] = dp[i-1][0].add(dp[i-1][1]).mod(BigInteger.valueOf(9901));
		}
		
		BigInteger res = dp[N][0].add(dp[N][1]).mod(BigInteger.valueOf(9901));
		System.out.println(res);
		
	}
}
