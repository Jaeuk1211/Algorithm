package p2748_피보나치_수_2_Bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] fibo = new long[91];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2; i<=90; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		System.out.println(fibo[n]);	
		
	}
}