package p1793_타일링_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger[] dp = new BigInteger[251];
			
		dp[0] = BigInteger.ONE;
		dp[1] = BigInteger.ONE;
		dp[2] = BigInteger.valueOf(3);
		
		for(int i=3; i<=250; i++) {
			dp[i] = dp[i-2].multiply(BigInteger.valueOf(2)).add(dp[i-1]);
		}
			
		String input = "";
		while((input = br.readLine()) != null) {
			int N = Integer.parseInt(input);

			System.out.println(dp[N]);
		}

	}
}
