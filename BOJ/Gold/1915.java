package p1915_가장_큰_정사각형_Gold5;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = br.readLine().split(" ");
		
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		int[][] matrix = new int[n][m];
		int[][] dp = new int[n][m];
		
		for(int i=0;i<n;i++) {
			String[] temp = br.readLine().split("");
			
			for(int j=0;j<m;j++) {
				matrix[i][j] = Integer.parseInt(temp[j]);
				if(i==0 || j==0) {
					dp[i][j] = matrix[i][j];
				}
			}
		}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				int u = dp[i-1][j];
				int ul = dp[i-1][j-1];
				int l = dp[i][j-1];
				
				if((u != 0) && (ul != 0) && (l != 0)) {
					if (matrix[i][j] == 1) {
						if(u == ul && ul == l) dp[i][j] = (int) Math.pow(Math.sqrt(u)+1, 2);
						else dp[i][j] = (int) Math.pow(Math.sqrt(Math.min(Math.min(u, l),ul))+1, 2);	
					} else {
						dp[i][j] = matrix[i][j];
					}
				} else {
					dp[i][j] = matrix[i][j];
				}
			}
		}
		
		int res=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(dp[i][j] > res) res = dp[i][j];
			}
		}
		
		System.out.println(res);
		
	}
}
