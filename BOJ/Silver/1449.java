package p1449_수리공_항승_Silver3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int[] loc = new int[N];
		
		for(int i=0; i<N; i++) {
			loc[i] = sc.nextInt();
		}
		
		Arrays.sort(loc);
		
		int res=0;
		int i=0;
		while(i<N) {			
			int temp=i;
			for(int j=i+1; j<N; j++) {
				if(loc[j]-loc[i] < L) temp=j;
			}
			res++;
			i = temp+1;
			
		}		
		System.out.println(res);
		
	}
}
