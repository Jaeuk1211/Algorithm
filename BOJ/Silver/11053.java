package p11053_가장_긴_증가하는_부분_수열_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int[] dp = new int[N];
			
		String[] s = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {		
			num[i] = Integer.parseInt(s[i]);	
			dp[i] = 1;
		}
		
		for(int i=1; i<N; i++) {
			
			int temp=1;
			for(int j=i; j>=0; j--) {
				if(num[j] < num[i]) {
					if(temp < dp[i]+dp[j])
						temp = dp[i]+dp[j];
				}
			}
			
			dp[i] = temp; 
			
		}
		
		int res=0;
		for(int i=0; i<N; i++) {
			if(dp[i] > res) res = dp[i];
		}
		
		System.out.println(res);
		
	}
}
