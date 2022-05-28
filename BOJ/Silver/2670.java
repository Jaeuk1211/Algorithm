package p2670_연속부분최대곱_Silver4;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws Exception{	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] dp = new double[N];
		double[] cal = new double[N];
		double res=0;
		
		for(int i=0; i<N; i++) {
			dp[i] = Double.parseDouble(br.readLine());
			cal[i] = dp[i];
			
			if(dp[i] > res) res=dp[i];
		}
	
		for(int i=1; i<N; i++) {
			for(int j=0; j+i<N; j++) {
				double temp = cal[j] * dp[i+j];
				cal[j] = temp;
				if(temp > res) res = temp;
			}
		}
		
		System.out.println(String.format("%.3f", res));
		
	}
}
