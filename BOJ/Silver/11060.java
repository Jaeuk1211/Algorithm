package p11060_점프_점프_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		
		int[] data = new int[N];
		int[] dp = new int[N];
		for(int i=0; i<N; i++) {
			data[i] = Integer.parseInt(num[i]);
			dp[i] = 0;
		}
		
		dp[N-1] = 0;		
		for(int i=N-2; i>=0; i--) {
			
			int min = 1001;
			for(int j=i+1; j<=i+data[i]; j++) {
				
				if(min > dp[j]) min = dp[j];
				
				if(j+1 >= N) break;
			}
			
			dp[i] = min+1;
			
		}		
		
		if(dp[0] == 1002) System.out.println(-1);
		else System.out.println(dp[0]);
		
	}
}
