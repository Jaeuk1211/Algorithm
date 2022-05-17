package p2089_minus2진법;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		String res = "";
		if(N==0) System.out.println(0);
		else {
			while(N != 0) {
				res = Integer.toString((int)Math.abs(N%-2)).concat(res);
				N = (int)Math.ceil((double) N/-2);
			}
			
		}
		
		System.out.println(res);
		
	}
}
