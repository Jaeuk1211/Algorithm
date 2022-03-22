package p10870_피보나치_수_5_Bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int fibo(int n) {

		if(n==0) return 0;
		else if(n==1) return 1;
		
		return fibo(n-1) + fibo(n-2);	
		
	}
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int r = fibo(n);
		
		System.out.println(r);		
		
	}
}
