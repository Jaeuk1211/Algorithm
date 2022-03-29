package p1059_좋은_구간;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int[] S = new int[L];
		
		for(int i=0; i<L; i++) {
			S[i] = sc.nextInt();
		}
		
		Arrays.sort(S);
		
		int n=sc.nextInt();
		int start=0;
		int end=0;
		
		for(int i=0;i<L;i++) {
			if(S[i] > n) {
				if(i == 0) {
					start = 1;
					end = S[i];
				} else {
					start = S[i-1] + 1;
					end = S[i];
				}
				break;
			}
		}
				
		int result=0;
		
		for(int i=start;i<=n;i++) {
			if(i == n) {
				for(int k=n+1;k<end;k++) result++;
			}
			else {
				for(int k=n;k<end;k++) result++;
			}
		}

		System.out.println(result);
	}
}
