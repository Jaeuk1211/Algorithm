package p1890_점프_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static int[][] map;
	public static long[][] dp;
	
	public static long travel(int row, int col) {
		
		if(dp[row][col] != -1) return dp[row][col];
		
		if(row == map.length-1 && col == map[row].length-1) return 1;
		
		dp[row][col] = 0;
		
		int r = row + map[row][col];
		int c = col + map[row][col];
		
		if(r > map.length && c > map[row].length) {
			return 0;
		}
		
		if(r < map.length) {
			dp[row][col] = Math.max(dp[row][col], dp[row][col] + travel(row + map[row][col], col));
		}
		
		if(c < map[row].length) {
			dp[row][col] = Math.max(dp[row][col], dp[row][col] + travel(row, col + map[row][col]));
		}
		
		return dp[row][col];
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		dp = new long[N][N];
		
		for(int i=0; i<N; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0 ;j<temp.length; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
				dp[i][j] = -1;
			}
		}
		
		travel(0,0);
		
		System.out.println(dp[0][0]);
		
	}
}
