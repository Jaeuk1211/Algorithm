package p11055_가장_큰_증가_부분_수열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		long[] num = new long[N];
		long[] dp = new long[N];
			
		String[] s = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {		
			num[i] = Long.parseLong(s[i]);	
			dp[i] = num[i];
		}
	
		
		for(int i=1; i<N; i++) {
			
			long temp=0;
			for(int j=i-1; j>=0; j--) {
				if(num[j] < num[i]) {
					if(temp < dp[i]+dp[j]) {
						temp = dp[i]+dp[j];
					}
				}
			}
			
			if(temp != 0) dp[i] = temp; 
			
		}
		
		long res=0;
		for(int i=0; i<N; i++) {
			if(dp[i] > res) res = dp[i];
		}
		
		System.out.println(res);
		
	}
}