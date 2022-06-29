package p15988_123더하기3_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[1000001];
		int temp=4;

		dp[1]=BigInteger.ONE;
		dp[2]=BigInteger.valueOf(2);
		dp[3]=BigInteger.valueOf(4);
		
		for(int i=1; i<=tc; i++) {

			int N = Integer.parseInt(br.readLine());
				
			for(int j=temp; j<=N; j++) {
				dp[j] = dp[j-1].add(dp[j-2].add(dp[j-3]));
				temp++;
			}
				
			System.out.println(dp[N].mod(BigInteger.valueOf(1000000009)));
		}
	}
}
