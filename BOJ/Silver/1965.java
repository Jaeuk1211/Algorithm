package p1965_상자넣기_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		int[] box = new int[N];
		int[] dp = new int[N];
		
		for(int i=0; i<N; i++) {
			box[i] = Integer.parseInt(input[i]);
			dp[i] = 1;
		}
		
		for(int i=1; i<N; i++) {
			
			int temp=1;
			for(int j=i; j>=0; j--) {
				if(box[j] < box[i]) {
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
