package p1495_기타리스트_Silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NSM = br.readLine().split(" ");
		
		int N = Integer.parseInt(NSM[0]);
		int S = Integer.parseInt(NSM[1]);
		int M = Integer.parseInt(NSM[2]);
		
		String[] input = br.readLine().split(" ");
		int[] vol = new int[N];
		int[][] dp = new int[N][M+1];
		
		for(int i=0; i<N; i++) {
			vol[i] = Integer.parseInt(input[i]);
		}
		
		if(S + vol[0] <= M) dp[0][S+vol[0]] = 1;
		if(S - vol[0] >= 0) dp[0][S-vol[0]] = 1;
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<=M; j++) {
				if(dp[i-1][j] == 1) {
					if(j + vol[i] <= M) dp[i][j+vol[i]] = 1;
					if(j - vol[i] >= 0) dp[i][j-vol[i]] = 1;
				}
			}
		}
		
		int max=0;
		int count=0;
		for(int i=M; i>=0; i--) {
			if(dp[N-1][i] == 1) {
				count++;
				if(i > max) max = i;
			}
		}
		
		if(count == 0) System.out.println(-1);
		else System.out.println(max);
		
	}
}
