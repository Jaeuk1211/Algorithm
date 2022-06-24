package p11727_2xn_타일링2_Silver3;

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
			else if(N==2) System.out.println(3);
		} else {
			
			dp[1] = BigInteger.ONE;
			dp[2] = BigInteger.valueOf(3);
			for(int i=3; i<=N; i++) {
				dp[i] = dp[i-2].multiply(BigInteger.valueOf(2)).add(dp[i-1]);
			}
			
			System.out.println(dp[N].mod(BigInteger.valueOf(10007)));
			
		}
		
	}
}
