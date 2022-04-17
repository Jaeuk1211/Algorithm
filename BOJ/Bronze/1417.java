package p1417_국회의원_선거;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int size = N-1;
		int[] candidate = new int[size];
		int ds = sc.nextInt();	
		int res=0;
		

		if(N==1) {
			System.out.println(0);
			return;
		}
		
		for(int i=0; i<size; i++) {
			candidate[i] = sc.nextInt();
		}
				
		while(true) {
			
			Arrays.sort(candidate);
			
			int count=0;			
			for(int i=0; i<size; i++) {
				if(candidate[i] >= ds) count++;
			}
			
			if(count == 0) break;
			
			candidate[size-1]--;
			ds++;
			res++;
					
		}
		
		
		
		System.out.println(res);
		
	}
	
}
