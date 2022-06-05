package p9184_신나는_함수_실행_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[][][] dp = new long[21][21][21];
		
		for(int i=0; i<21; i++) {
			for(int j=0; j<21; j++) {
				dp[i][j][0] = 1;
				dp[0][i][j] = 1;
				dp[i][0][j] = 1;
			}
		}
		
		for(int i=1; i<21; i++) {
			for(int j=1; j<21; j++) {
				for(int k=1; k<21; k++) {
					if(i<j && j<k)
						dp[i][j][k] = dp[i][j][k-1] + dp[i][j-1][k-1] - dp[i][j-1][k];
					else 
						dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k] + dp[i-1][j][k-1] - dp[i-1][j-1][k-1];
				}
			}
		}
	
		while(true) {
			
			String[] s = br.readLine().split(" ");
			
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			
			if(a==-1 && b==-1 && c==-1) break;
			
			System.out.print("w(" + a + ", " + b + ", " + c + ") = ");
			
			if(a<=0 || b<=0 || c<=0) System.out.println(1);
			else if(a>20 || b>20 || c>20) System.out.println(dp[20][20][20]);
			else System.out.println(dp[a][b][c]);
		
		}
		
	}
}
