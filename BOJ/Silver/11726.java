package p11726_2xn_타일링_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[N+1];
			
		if(N<=2) {
			if(N==1) System.out.println(1);
			else System.out.println(2);
		} else {
			
			dp[1] = BigInteger.ONE;
			dp[2] = BigInteger.valueOf(2);
			for(int i=3; i<=N; i++) {
				dp[i] = dp[i-2].add(dp[i-1]);
			}
			
			System.out.println(dp[N].mod(BigInteger.valueOf(10007)));
			
		}
		
	}
}
