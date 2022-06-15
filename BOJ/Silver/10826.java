package p10826_피보나치_수_4_Silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger[] fibo = new BigInteger[10001];
		
		fibo[0] = BigInteger.ZERO;
		fibo[1] = BigInteger.ONE;
		
		for(int i=2; i<=10000; i++) {
			fibo[i] = fibo[i-2].add(fibo[i-1]);
		}
		
		System.out.println(fibo[n]);	
		
	}
}