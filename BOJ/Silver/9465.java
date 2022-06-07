package p9465_스티커_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int[][] data = new int[2][N+1];
			long[][] dp = new long[2][N+1];
			
			String[] s1 = br.readLine().split(" ");
			String[] s2 = br.readLine().split(" ");
			
			for(int j=1; j<=N; j++) {		
				data[0][j] = Integer.parseInt(s1[j-1]);
				data[1][j] = Integer.parseInt(s2[j-1]);
			}
			
			dp[0][1] = data[0][1];
			dp[1][1] = data[1][1];
			
			for(int j=2; j<=N; j++) {
				
				dp[0][j] += Math.max(dp[1][j-1], dp[1][j-2]) + data[0][j];
				dp[1][j] += Math.max(dp[0][j-1], dp[0][j-2]) + data[1][j];
				
			}		
			
			System.out.println(Math.max(dp[0][N], dp[1][N]));
			
		}
	}
}
