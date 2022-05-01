package p1645_성지의_생일파티;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] k = new int[N];
		int[] res = new int[N];
		
		for(int i=0; i<N; i++) {
			k[i] = sc.nextInt();
			res[i] = 0;
		}
		
		Arrays.sort(k);
		
		for(int i=N-1; i>=0; i--) {
			int a=0;
			for(int j=0; j<k[i]+a; j++) {
				if(j==i) {
					a++;
				} else {
					if(res[j] == 0) res[j]++;
				}
			}
			 
		}		
		
		int result=0;
		for(int i=0; i<N; i++) {
			if(res[i] == 1) result++;
		}

		System.out.println(result);
		
	}
}
