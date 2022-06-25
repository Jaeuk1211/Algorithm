package p14501_퇴사_Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] T = new int[N];
		int[] P = new int[N];
		int[] dp = new int[N];
		
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			
			T[i] = Integer.parseInt(s[0]);
			P[i] = Integer.parseInt(s[1]);
			dp[i] = 0;
		}
		
		if(T[N-1] == 1) dp[N-1] = P[N-1];
		else dp[N-1] = 0;
		
		for(int i=N-2; i>=0; i--) {
			int max = 0;
			for(int j=i+T[i]; j<N; j++) {
				if(max < dp[j]) max = dp[j];
			}
			
			dp[i] += max;
			if(i + T[i] <= N) dp[i] += P[i];
		
		}
		
		int res = dp[0];
		for(int i=0; i<N; i++) {
			if(dp[i] > res) res=dp[i];
		}
		
		System.out.println(res);
		
	}
}
