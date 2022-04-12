package p1359_복권;

import java.util.Scanner;

public class Main {	
	public static double comb(int n, int r) {
		int p=1;
		int c=1;
		
		while(r>0) {
			c *= n--;
			p *= r--;
		}
		
		return c/p;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		
		double chosen = 0;
		for(int i=K; i<=M; i++) {
			if(N-M < M-i) continue;
			chosen += comb(N-M,M-i) * comb(M,i);
		}
		
		double whole = comb(N,M);
		
		double res = chosen/whole;
		
		System.out.println(res);
		
	}
}
