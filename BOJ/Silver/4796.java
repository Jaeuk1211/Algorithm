package p4796_캠핑_Silver5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc=1;
		
		while(true) {
			
			String[] LPV = sc.nextLine().split(" ");
			
			int L = Integer.parseInt(LPV[0]);
			int P = Integer.parseInt(LPV[1]);
			int V = Integer.parseInt(LPV[2]);
			
			if(L==0 && P==0 && V==0) break;
			
			int res = 0;
			while(V >= 0) {
				if(V-P >= 0) {
					V -= P;
					res += L;
				} else {
					if(V>L) res += L; 
					else res += V;
					
					V -= P;
				}
				
			}
			
			System.out.println("Case " + tc + ": " + res);
			tc++;
			
		}
	}
}
