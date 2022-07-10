package p2225_합분해_Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		
		BigInteger[][] dp = new BigInteger[201][201];	
		for(int i=2; i<=N; i++) {
			dp[i][1] = BigInteger.ONE;
			dp[i][2] = BigInteger.valueOf(i+1);
		}
		for(int i=1; i<=K; i++) {
			dp[1][i] = BigInteger.valueOf(i);
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=3; j<=K; j++) {
				dp[i][j] = dp[i-1][j].add(dp[i][j-1]).mod(BigInteger.valueOf(1000000000));
			}
		}
		
		System.out.println(dp[N][K].mod(BigInteger.valueOf(1000000000)));
		
	}
}
