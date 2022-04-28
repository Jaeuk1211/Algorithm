package p1535_안녕_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		
		int[] hp = new int[N];
		int[] joy = new int[N];
		int[] dp = new int[100];
		
		for(int i=0; i<N; i++) {
			hp[i] = Integer.parseInt(input1[i]);
			joy[i] = Integer.parseInt(input2[i]);
		}
	
		for(int i=0; i<100; i++) {
			dp[i] =0;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=99; j>=0; j--) {
				
				int idx=hp[i]+j;
				
				if(idx < 100) dp[idx] = Math.max(dp[idx], dp[j]+joy[i]);
			}		
		}
		
		int res=0;
		for(int i=0; i<100; i++) {
			if(dp[i] > res) res=dp[i];
		}
		
		System.out.println(res);
	}
}
