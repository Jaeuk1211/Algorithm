package P1932_정수_삼각형_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] data = new int[N][N];
		int[][] dp = new int[N][N];
		
		for(int i=0; i<N; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0; j<s.length; j++) {
				data[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		dp[0][0] = data[0][0];
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(j == 0) dp[i][j] = data[i][j] + dp[i-1][j];
				else if (j==i) dp[i][j] = data[i][j] + dp[i-1][j-1];
				else dp[i][j] = Math.max(data[i][j] + dp[i-1][j], data[i][j] + dp[i-1][j-1]);
			}
			
		}
		
		int max=0;
		for(int i=0; i<N; i++) {
			if(dp[N-1][i] > max) max = dp[N-1][i];
		}
		
		System.out.println(max);
		
	}	
}
