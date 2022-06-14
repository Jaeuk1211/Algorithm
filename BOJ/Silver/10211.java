package p10211_Maximum_Subarray_Silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			
			int N = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			
			long[] arr = new long[N];
			long[] dp = new long[N];
			
			for(int j=0; j<N; j++) {
				arr[j] = Long.parseLong(str[j]);
				dp[j] = arr[j];
			}
			
			for(int j=0; j<N; j++) {
				
				long temp=0;
				for(int k=j; k<N; k++) {
					temp += arr[k];
				
					if(dp[j] < temp) dp[j] = temp;
				}		
			}
			
			long max = dp[0];
			for(int j=0; j<N; j++) {
				if(dp[j] > max) max = dp[j];
			}
			
			System.out.println(max);
			
		}
		
	}
}
