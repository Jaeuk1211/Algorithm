package p1149_RGB거리_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] data = new int[N+1][3];
		int[][] dp = new int[N+1][3];
		
		for(int i=1; i<=N; i++) {
			
			String[] temp = br.readLine().split(" ");
			
			data[i][0] = Integer.parseInt(temp[0]);
			data[i][1] = Integer.parseInt(temp[1]);
			data[i][2] = Integer.parseInt(temp[2]);
		}
		
		dp[0][0] = 0;
		dp[0][1] = 0;
		dp[0][2] = 0;
		for(int i=1; i<=N; i++) {
			
			dp[i][0] = Math.min(dp[i-1][1] + data[i][0], dp[i-1][2] + data[i][0]);
			dp[i][1] = Math.min(dp[i-1][0] + data[i][1], dp[i-1][2] + data[i][1]);
			dp[i][2] = Math.min(dp[i-1][0] + data[i][2], dp[i-1][1] + data[i][2]);
			
		}
		
		System.out.println(Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]));
		
	}
}
