package p1788_피보나치_수의_확장_Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] fibo = new long[3];
		
		if(Math.abs(N) <= 1) {
			System.out.println(Math.abs(N));
			System.out.println(Math.abs(N));
		} else {
		
			fibo[0] = 0;
			fibo[1] = 1;
			
			for(int i=2; i<=Math.abs(N); i++) {
				fibo[i%3] = fibo[(i-2)%3]%1000000000 + fibo[(i-1)%3]%1000000000;
			}
			
			if(N<0 && N%2==0) System.out.println(-1);
			else System.out.println(1);
			
			System.out.println(fibo[Math.abs(N)%3]%1000000000);
		
		}
		
	}
}
