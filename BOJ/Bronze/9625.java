package p9625_BABBA_Bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] res = new int[46][2];
		
		res[0][0] = 1;
		res[0][1] = 0;
		
		for(int i=1; i<=N; i++) {
			res[i][0] = res[i-1][1];
			res[i][1] = res[i-1][0] + res[i-1][1];
		}
		
		System.out.println(res[N][0] + " " + res[N][1]);
		
	}
}
