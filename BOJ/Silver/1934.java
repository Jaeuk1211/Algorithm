package p1934_최소공배수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static int gcd(int a, int b) {
		
		if(b==0) return a;
		else return gcd(b, a%b);
	}
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		for(int i=0; i<tc; i++) {
			String[] s = br.readLine().split(" ");
			
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			
			int gcd = gcd(A,B);
			
			System.out.println((A*B)/gcd);
			
		}	
	}
}
